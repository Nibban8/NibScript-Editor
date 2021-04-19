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
	 * Visit a parse tree produced by the {@code impresionExpresion}
	 * labeled alternative in {@link OperacionesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionExpresion(OperacionesParser.ImpresionExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link OperacionesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(OperacionesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espacio}
	 * labeled alternative in {@link OperacionesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacio(OperacionesParser.EspacioContext ctx);
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