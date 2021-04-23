package oivan.principal;

import oivan.parser.OperacionesBaseVisitor;
import oivan.parser.OperacionesParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends OperacionesBaseVisitor<Integer> {

    Map<String,Integer> memoria = new HashMap<String,Integer>();
    String print = new String();

    @Override
    public Integer visitDeclaracion(OperacionesParser.DeclaracionContext ctx) {

        String id  = ctx.ID().getText();


        if(memoria.containsKey(id)){


            try {
                FileWriter writer = new FileWriter("res.txt", true);
                writer.append("La variable "+ id + " esta repetida");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            throw new VariableDuplicadaException();

        }
        else{
            try {
                int valor = visit(ctx.expr());
                memoria.put(id,valor);

            } catch (Exception e) {
                memoria.put(id,0);
            }
        }
        return 0;
    }

    @Override
    public Integer visitAsignacion(OperacionesParser.AsignacionContext ctx) {
        String id  = ctx.ID().getText();
        int valor = visit(ctx.expr());

        if(memoria.containsKey(id)){
            memoria.put(id,valor);
        }
        else {
            try {
                FileWriter writer = new FileWriter("res.txt", true);
                writer.append("La variable " + id + " no existe");
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
        if(ctx.op.getType() == OperacionesParser.POR){
            return izq * der;
        }
        return izq / der;
    }

    @Override
    public Integer visitImpresionExpresion(OperacionesParser.ImpresionExpresionContext ctx) {


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


}