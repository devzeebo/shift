package com.bearleft.shift.parse
import com.bearleft.shift.gen.ShiftParser
/**
 * User: Eric Siebeneich
 * Date: 5/2/14
 */
class ExpressionBuilder {

	ExpressionBuilder left
	ExpressionBuilder right

	String value

	int operator

	ExpressionBuilder(ShiftParser.ExpressionContext ctx) {

		switch (ctx.class) {
			case ShiftParser.UnaryExpressionContext:
				ctx = (ShiftParser.UnaryExpressionContext)ctx
				right = new ExpressionBuilder(ctx.expression())
				operator = ShiftParser."${['BANG','PLUS','SUB','TILDE'].find { ctx."$it"() }}"
				break
			case ShiftParser.BinaryExpressionContext:
				ctx = (ShiftParser.BinaryExpressionContext)ctx
				left = new ExpressionBuilder(ctx.expression(0))
				right = new ExpressionBuilder(ctx.expression(1))
				operator = ShiftParser."${['STAR', 'SLASH', 'PERCENT', 'PLUS', 'SUB', 'LTLT', 'GTGT', 'GTGTGT', 'STARSTAR'].find { ctx."$it"() }}"
				break
			case ShiftParser.VariableExpressionContext:
			case ShiftParser.StringExpressionContext:
			case ShiftParser.IntExpressionContext:
			case ShiftParser.FloatExpressionContext:
			case ShiftParser.TrueExpressionContext:
			case ShiftParser.FalseExpressionContext:
			case ShiftParser.NullExpressionContext:
				value = ctx."""${['STRING_LITERAL', 'INTEGER_LITERAL', 'FLOAT_LITERAL', 'TRUE', 'FALSE', 'NULL', 'IDENTIFIER'].find {
					ctx.respondsTo(it)
				}}"""()
				break
		}
	}

	def toExpression() {
		if (!(left || right))
			return value
		return left.toExpression() + " " + right.toExpression() + " " + operator
	}
}
