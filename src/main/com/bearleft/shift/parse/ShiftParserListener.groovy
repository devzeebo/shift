package com.bearleft.shift.parse
import com.bearleft.shift.gen.ShiftBaseListener
import com.bearleft.shift.gen.ShiftParser

/**
 * User: Eric
 * Date: 4/25/14
 */
class ShiftParserListener extends ShiftBaseListener {

	void exitStatement(ShiftParser.StatementContext ctx) {
		switch(ctx.start.text) {
			case 'for': break
			case 'while': break
			case 'if': break
			default:
				println new ExpressionBuilder(ctx.expression()).toExpression()
		}
	}
}