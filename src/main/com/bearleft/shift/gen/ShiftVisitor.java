// Generated from C:/programming/shift/res\Shift.g4 by ANTLR 4.x

package com.bearleft.shift.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShiftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShiftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShiftParser#declarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationExpression(@NotNull ShiftParser.DeclarationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(@NotNull ShiftParser.FieldAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(@NotNull ShiftParser.ClassDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull ShiftParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull ShiftParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(@NotNull ShiftParser.ElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull ShiftParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(@NotNull ShiftParser.CallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#powerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(@NotNull ShiftParser.PowerExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull ShiftParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#nullExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(@NotNull ShiftParser.NullExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#methodCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(@NotNull ShiftParser.MethodCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#intExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(@NotNull ShiftParser.IntExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#prefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(@NotNull ShiftParser.PrefixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(@NotNull ShiftParser.ForLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(@NotNull ShiftParser.ConstructorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull ShiftParser.StringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull ShiftParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull ShiftParser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull ShiftParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(@NotNull ShiftParser.PostfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#floatExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpression(@NotNull ShiftParser.FloatExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull ShiftParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(@NotNull ShiftParser.BinaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ShiftParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull ShiftParser.FieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#lineTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineTerminator(@NotNull ShiftParser.LineTerminatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(@NotNull ShiftParser.BooleanExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ShiftParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(@NotNull ShiftParser.ClassMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(@NotNull ShiftParser.WhileLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull ShiftParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ShiftParser#bitwiseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpression(@NotNull ShiftParser.BitwiseExpressionContext ctx);
}