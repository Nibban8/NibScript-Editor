package oivan.principal;

import oivan.parser.OperacionesBaseVisitor;
import oivan.parser.OperacionesParser;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyVisitor extends OperacionesBaseVisitor<Integer> {

    Map<String,Integer> memoria = new HashMap<String,Integer>();
    String print = new String();

    @Override
    public Integer visitDeclaracion(OperacionesParser.DeclaracionContext ctx) {

        String id  = ctx.ID().getText();

       try{
           if(memoria.containsKey(id))
               throw new VariableDuplicadaException("[Error] La variable: \" "+ id + "\" esta duplicada");

       }catch (VariableDuplicadaException err){
           try {
               FileWriter writer = new FileWriter("res.txt", true);
               writer.append("*** [Error] La variable: \"" + id + "\" esta duplicada ***\n");
               writer.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
        try {
            int valor = visit(ctx.expr());
            memoria.put(id,valor);

        } catch (Exception e) {
            memoria.put(id,0);
        }

        return 0;
    }

    @Override
    public Integer visitIfHeader(OperacionesParser.IfHeaderContext ctx) {
        int izq = visit(ctx.condition().expr(0));
        int der = visit(ctx.condition().expr(1));
        String cond = ctx.condition().comparation().getText();

        Boolean flag = false;

        switch (cond){
            case "==" :
                flag = (izq == der); break;
            case "!=" :
                flag = (izq != der); break;
            case ">=" :
                flag = (izq >= der); break;
            case "<=" :
                flag = (izq <= der); break;
            case "<" :
                flag = (izq < der); break;
            case ">" :
                flag = (izq > der); break;
        }
        System.out.println(flag);
        if (flag) {
            visit(ctx.cuerpo());
        }

        return 0;
    }

    @Override
    public Integer visitAsignacion(OperacionesParser.AsignacionContext ctx) {
        String id  = ctx.ID().getText();
        int valor = visit(ctx.expr());

       try{
           if (!memoria.containsKey(id)){
               throw new VariableNoExisteException("[Error] Asignacion a variable no declarada: " + id);
           }
           memoria.put(id,valor);
      }catch (VariableNoExisteException err){
           try {
               FileWriter writer = new FileWriter("res.txt", true);
               writer.append("*** [Error] Asignacion a variable no declarada: \"" + id + "\" ***\n");
               writer.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

        return valor;
    }
    @Override
    public Integer visitInt(OperacionesParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitParentesis(OperacionesParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitId(OperacionesParser.IdContext ctx) {
        return memoria.get(ctx.ID().getText());
    }

    @Override
    public Integer visitSumRes(OperacionesParser.SumResContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));

        if(ctx.op.getType() == OperacionesParser.MAS){
            return izq + der;
        }
        return izq - der;
    }

    @Override
    public Integer visitMulDiv(OperacionesParser.MulDivContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        if(ctx.op.getType() == OperacionesParser.DIV){
            try {
                if (der == 0) {
                    throw new DivisionByCeroException("*** [Error] No puedes dividir entre cero ***");
                }
                return izq/der;
            } catch (DivisionByCeroException err){
                try {
                    FileWriter writer = new FileWriter("res.txt", true);
                    writer.append("*** [Error] No puedes dividir entre cero ***\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }

            }
        }

        return izq * der;
    }

    @Override
    public Integer visitPrintExpr(OperacionesParser.PrintExprContext ctx) {

        try {
            Integer valor = visit(ctx.expr());
            String res = valor + "\n";
            FileWriter writer = new FileWriter("res.txt", true);
            writer.append(res);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer visitPrintString(OperacionesParser.PrintStringContext ctx) {
        try {
            String valor = ctx.strings().getText();
            String res = valor + "\n";
            FileWriter writer = new FileWriter("res.txt", true);
            writer.append(res);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}