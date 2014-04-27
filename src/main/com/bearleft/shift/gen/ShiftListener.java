// Generated from C:/programming/shift/res\Shift.g4 by ANTLR 4.x

package com.bearleft.shift.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShiftParser}.
 */
public interface ShiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShiftParser#declarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationExpression(@NotNull ShiftParser.DeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#declarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationExpression(@NotNull ShiftParser.DeclarationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull ShiftParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull ShiftParser.FieldAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(@NotNull ShiftParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(@NotNull ShiftParser.ClassDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull ShiftParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull ShiftParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull ShiftParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull ShiftParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(@NotNull ShiftParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(@NotNull ShiftParser.ElseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull ShiftParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull ShiftParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(@NotNull ShiftParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(@NotNull ShiftParser.CallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(@NotNull ShiftParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(@NotNull ShiftParser.PowerExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull ShiftParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull ShiftParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#nullExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(@NotNull ShiftParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#nullExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(@NotNull ShiftParser.NullExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#methodCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull ShiftParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#methodCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull ShiftParser.MethodCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpression(@NotNull ShiftParser.IntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpression(@NotNull ShiftParser.IntExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(@NotNull ShiftParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(@NotNull ShiftParser.PrefixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull ShiftParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull ShiftParser.ForLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(@NotNull ShiftParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(@NotNull ShiftParser.ConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull ShiftParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull ShiftParser.StringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull ShiftParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull ShiftParser.VariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull ShiftParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull ShiftParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull ShiftParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull ShiftParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull ShiftParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull ShiftParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#floatExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpression(@NotNull ShiftParser.FloatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#floatExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpression(@NotNull ShiftParser.FloatExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull ShiftParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull ShiftParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(@NotNull ShiftParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(@NotNull ShiftParser.BinaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ShiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ShiftParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull ShiftParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull ShiftParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#lineTerminator}.
	 * @param ctx the parse tree
	 */
	void enterLineTerminator(@NotNull ShiftParser.LineTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#lineTerminator}.
	 * @param ctx the parse tree
	 */
	void exitLineTerminator(@NotNull ShiftParser.LineTerminatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull ShiftParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull ShiftParser.BooleanExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull ShiftParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull ShiftParser.MethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(@NotNull ShiftParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(@NotNull ShiftParser.ClassMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull ShiftParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull ShiftParser.WhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull ShiftParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull ShiftParser.ComparisonExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ShiftParser#bitwiseExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpression(@NotNull ShiftParser.BitwiseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#bitwiseExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpression(@NotNull ShiftParser.BitwiseExpressionContext ctx);
}