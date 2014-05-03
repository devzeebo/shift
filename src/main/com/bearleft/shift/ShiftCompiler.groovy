package com.bearleft.shift
import com.bearleft.shift.gen.ShiftLexer
import com.bearleft.shift.gen.ShiftParser
import com.bearleft.shift.parse.ShiftParserListener
import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CommonTokenStream
/**
 * User: Eric
 * Date: 4/15/14
 */
class ShiftCompiler {

	ShiftCompiler() {

		ShiftLexer lexer = new ShiftLexer(new ANTLRFileStream('test.shift'))

		ShiftParser parser = new ShiftParser(new CommonTokenStream(lexer))
		parser.addParseListener(new ShiftParserListener())

//		parser.addErrorListener(new BaseErrorListener() {
//			void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//				println msg
//			}
//			void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
//				println 'Ambiguous'
//			}
//			void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
//				println 'Full Context'
//			}
//			void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
//				println 'Context Sensitive'
//			}
//		})

		parser.compilationUnit()
	}

	public static void main(String[] args) {
		new ShiftCompiler()
	}
}
