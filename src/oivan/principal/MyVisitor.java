package oivan.principal;

import oivan.parser.OperacionesBaseVisitor;
import oivan.parser.OperacionesParser;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends OperacionesBaseVisitor<Value> {

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> mem = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAsignacion(OperacionesParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());


        try{
            if (!mem.containsKey(id)){
                throw new VariableNoExisteException("[Error] Asignacion a variable no declarada: " + id);
            }
            mem.put(id,value);
        }catch (VariableNoExisteException err){
            try {
                FileWriter writer = new FileWriter("res.txt", true);
                writer.append("*** [Error] Asignacion a variable no declarada: \"").append(id).append("\" ***\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return mem.put(id, value);




    }


    @Override
    public Value visitDeclaracion(OperacionesParser.DeclaracionContext ctx) {
        String id  = ctx.ID().getText();

        try{
            if(mem.containsKey(id))
                throw new VariableDuplicadaException("[Error] La variable: \" "+ id + "\" esta duplicada");

        }catch (VariableDuplicadaException err){
            try {
                FileWriter writer = new FileWriter("res.txt", true);
                writer.append("*** [Error] La variable: \"").append(id).append("\" esta duplicada ***\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Value valor = visit(ctx.expr());
            mem.put(id,valor);

        } catch (Exception e) {
            mem.put(id,new Value(0));
        }

        return super.visitDeclaracion(ctx);
    }

    @Override
    public Value visitIdAtom(OperacionesParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = mem.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(OperacionesParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(OperacionesParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(OperacionesParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(OperacionesParser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(OperacionesParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }


    @Override
    public Value visitPowExpr(OperacionesParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitUnaryMinusExpr(OperacionesParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(OperacionesParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull OperacionesParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));


        switch (ctx.op.getType()) {
            case OperacionesParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case OperacionesParser.DIV:
                writeError(right);
                return new Value(left.asDouble() / right.asDouble());
            case OperacionesParser.MOD:
                writeError(right);
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + OperacionesParser.tokenNames[ctx.op.getType()]);
        }
    }

    private void writeError(Value right) {
        if(right.asDouble() == 0) try {
            throw new DivisionByCeroException("*** [Error] No puedes dividir entre cero ***");
        } catch (DivisionByCeroException err) {
            try {
                FileWriter writer = new FileWriter("res.txt", true);
                writer.append("*** [Error] No puedes dividir entre cero ***\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Value visitAdditiveExpr(@NotNull OperacionesParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case OperacionesParser.MAS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case OperacionesParser.MENOS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + OperacionesParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(@NotNull OperacionesParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case OperacionesParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case OperacionesParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case OperacionesParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case OperacionesParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + OperacionesParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(@NotNull OperacionesParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case OperacionesParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case OperacionesParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + OperacionesParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(OperacionesParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(OperacionesParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // log override
    @Override
    public Value visitLog(OperacionesParser.LogContext ctx) {
        Value value = this.visit(ctx.expr());

        try {
            String res = value.asString() + "\n";
            FileWriter writer = new FileWriter("res.txt", true);
            writer.append(res);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(OperacionesParser.If_statContext ctx) {

        List<OperacionesParser.Condition_blockContext> conditions =  ctx.condition_block();
        boolean evaluatedBlock = false;

        for(OperacionesParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(OperacionesParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
}