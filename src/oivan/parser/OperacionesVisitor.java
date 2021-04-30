// Generated from Operaciones.g4 by ANTLR 4.8
package oivan.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperacionesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperacionesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(OperacionesParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link OperacionesParser#printConent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(OperacionesParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link OperacionesParser#printConent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(OperacionesParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#functElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctElse(OperacionesParser.FunctElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifHeader}
	 * labeled alternative in {@link OperacionesParser#functIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfHeader(OperacionesParser.IfHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(OperacionesParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OperacionesParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionIF}
	 * labeled alternative in {@link OperacionesParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIF(OperacionesParser.FunctionIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link OperacionesParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(OperacionesParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link OperacionesParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(OperacionesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link OperacionesParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(OperacionesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espacio}
	 * labeled alternative in {@link OperacionesParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacio(OperacionesParser.EspacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#comparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(OperacionesParser.ComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(OperacionesParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(OperacionesParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(OperacionesParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(OperacionesParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(OperacionesParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(OperacionesParser.IntContext ctx);
}