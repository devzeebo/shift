// Generated from R:/programming/shift/res\Shift.g4 by ANTLR 4.x
package com.bearleft.shift.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShiftParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INTEGER_LITERAL=4, FLOAT_LITERAL=5, STRING_LITERAL=6, 
		WS=7, NEWLINE=8, COMMENT=9, LINE_COMMENT=10, CLASS=11, FOR=12, WHILE=13, 
		IF=14, ELSE=15, DEF=16, NEW=17, RETURN=18, STATIC=19, TRUE=20, FALSE=21, 
		NULL=22, LPAREN=23, RPAREN=24, LBRACKET=25, RBRACKET=26, SEMI=27, COMMA=28, 
		DOT=29, EQ=30, AMP=31, BAR=32, CARET=33, PERCENT=34, PLUS=35, SUB=36, 
		STAR=37, SLASH=38, BANG=39, TILDE=40, QUESTION=41, COLON=42, EQEQ=43, 
		SPACESHIP=44, AMPAMP=45, BARBAR=46, PLUSPLUS=47, SUBSUB=48, STARSTAR=49, 
		PLUSEQ=50, SUBEQ=51, STAREQ=52, SLASHEQ=53, AMPEQ=54, BAREQ=55, CARETEQ=56, 
		PERCENTEQ=57, BANGEQ=58, GT=59, LT=60, LTLT=61, GTGT=62, GTGTGT=63, LTE=64, 
		GTE=65, IDENTIFIER=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "'{'", "'}'", "INTEGER_LITERAL", "FLOAT_LITERAL", 
		"STRING_LITERAL", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "'class'", 
		"'for'", "'while'", "'if'", "'else'", "'def'", "'new'", "'return'", "'static'", 
		"'true'", "'false'", "'null'", "'('", "')'", "'['", "']'", "';'", "','", 
		"'.'", "'='", "'&'", "'|'", "'^'", "'%'", "'+'", "'-'", "'*'", "'/'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<=>'", "'&&'", "'||'", "'++'", "'--'", 
		"'**'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'!='", "'>'", "'<'", "'<<'", "'>>'", "'>>>'", "'<='", "'>='", "IDENTIFIER"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_lineTerminator = 1, RULE_classDef = 2, 
		RULE_classMember = 3, RULE_method = 4, RULE_constructor = 5, RULE_field = 6, 
		RULE_parameterList = 7, RULE_argumentList = 8, RULE_blockStatement = 9, 
		RULE_statement = 10, RULE_expression = 11, RULE_forLoop = 12, RULE_whileLoop = 13, 
		RULE_ifStatement = 14, RULE_elseStatement = 15;
	public static final String[] ruleNames = {
		"compilationUnit", "lineTerminator", "classDef", "classMember", "method", 
		"constructor", "field", "parameterList", "argumentList", "blockStatement", 
		"statement", "expression", "forLoop", "whileLoop", "ifStatement", "elseStatement"
	};

	@Override
	public String getGrammarFileName() { return "Shift.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ShiftParser.NEWLINE); }
		public TerminalNode EOF() { return getToken(ShiftParser.EOF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShiftParser.NEWLINE, i);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==CLASS) {
				{
				setState(34);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(32); classDef();
					}
					break;
				case NEWLINE:
					{
					setState(33); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineTerminatorContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ShiftParser.NEWLINE, 0); }
		public TerminalNode SEMI() { return getToken(ShiftParser.SEMI, 0); }
		public LineTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterLineTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitLineTerminator(this);
		}
	}

	public final LineTerminatorContext lineTerminator() throws RecognitionException {
		LineTerminatorContext _localctx = new LineTerminatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lineTerminator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public LineTerminatorContext lineTerminator(int i) {
			return getRuleContext(LineTerminatorContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public List<LineTerminatorContext> lineTerminator() {
			return getRuleContexts(LineTerminatorContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(ShiftParser.CLASS, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitClassDef(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(CLASS);
			setState(44); match(IDENTIFIER);
			setState(45); match(2);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << DEF) | (1L << SEMI))) != 0)) {
				{
				setState(48);
				switch (_input.LA(1)) {
				case DEF:
					{
					setState(46); classMember();
					}
					break;
				case NEWLINE:
				case SEMI:
					{
					setState(47); lineTerminator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classMember);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); constructor();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); method();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode DEF() { return getToken(ShiftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ShiftParser.EQ, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(DEF);
			setState(61); match(IDENTIFIER);
			setState(62); match(EQ);
			setState(63); match(2);
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64); parameterList();
				}
				break;
			}
			setState(68);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(67); blockStatement();
				}
			}

			setState(70); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ShiftParser.NEW, 0); }
		public TerminalNode DEF() { return getToken(ShiftParser.DEF, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ShiftParser.EQ, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(DEF);
			setState(73); match(NEW);
			setState(74); match(EQ);
			setState(75); match(2);
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76); parameterList();
				}
				break;
			}
			setState(80);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(79); blockStatement();
				}
			}

			setState(82); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ShiftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ShiftParser.EQ, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(DEF);
			setState(85); match(IDENTIFIER);
			setState(88);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(86); match(EQ);
				setState(87); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); argumentList();
			setState(91); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ShiftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ShiftParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(ShiftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShiftParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94); match(COMMA);
				setState(95); match(IDENTIFIER);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public LineTerminatorContext lineTerminator(int i) {
			return getRuleContext(LineTerminatorContext.class,i);
		}
		public List<LineTerminatorContext> lineTerminator() {
			return getRuleContexts(LineTerminatorContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
					{
					setState(101); statement();
					}
				}

				setState(104); lineTerminator();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case DEF:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case PLUS:
			case SUB:
			case BANG:
			case TILDE:
			case PLUSPLUS:
			case SUBSUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); expression(0);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); whileLoop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); ifStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationExpressionContext extends ExpressionContext {
		public TerminalNode DEF() { return getToken(ShiftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ShiftParser.EQ, 0); }
		public DeclarationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitDeclarationExpression(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(ShiftParser.STRING_LITERAL, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitStringExpression(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode RPAREN() { return getToken(ShiftParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ShiftParser.LPAREN, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitVariableExpression(this);
		}
	}
	public static class FieldAccessContext extends ExpressionContext {
		public TerminalNode QUESTION() { return getToken(ShiftParser.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(ShiftParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(ShiftParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitFieldAccess(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQ() { return getToken(ShiftParser.EQ, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public TerminalNode TILDE() { return getToken(ShiftParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ShiftParser.BANG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ShiftParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ShiftParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitUnaryExpression(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitCallExpression(this);
		}
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public TerminalNode PLUSPLUS() { return getToken(ShiftParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(ShiftParser.SUBSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitPostfixExpression(this);
		}
	}
	public static class FloatExpressionContext extends ExpressionContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(ShiftParser.FLOAT_LITERAL, 0); }
		public FloatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterFloatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitFloatExpression(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public TerminalNode STARSTAR() { return getToken(ShiftParser.STARSTAR, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTLT() { return getToken(ShiftParser.LTLT, 0); }
		public TerminalNode PERCENT() { return getToken(ShiftParser.PERCENT, 0); }
		public TerminalNode STAR() { return getToken(ShiftParser.STAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PLUS() { return getToken(ShiftParser.PLUS, 0); }
		public TerminalNode GTGTGT() { return getToken(ShiftParser.GTGTGT, 0); }
		public TerminalNode SLASH() { return getToken(ShiftParser.SLASH, 0); }
		public TerminalNode GTGT() { return getToken(ShiftParser.GTGT, 0); }
		public TerminalNode SUB() { return getToken(ShiftParser.SUB, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitBinaryExpression(this);
		}
	}
	public static class FalseExpressionContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(ShiftParser.FALSE, 0); }
		public FalseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitFalseExpression(this);
		}
	}
	public static class TrueExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(ShiftParser.TRUE, 0); }
		public TrueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitTrueExpression(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(ShiftParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitNullExpression(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ShiftParser.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(ShiftParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShiftParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(ShiftParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitMethodCallExpression(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public TerminalNode BANGEQ() { return getToken(ShiftParser.BANGEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(ShiftParser.GTE, 0); }
		public TerminalNode EQEQ() { return getToken(ShiftParser.EQEQ, 0); }
		public TerminalNode BARBAR() { return getToken(ShiftParser.BARBAR, 0); }
		public TerminalNode SPACESHIP() { return getToken(ShiftParser.SPACESHIP, 0); }
		public TerminalNode LT() { return getToken(ShiftParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ShiftParser.LTE, 0); }
		public TerminalNode AMPAMP() { return getToken(ShiftParser.AMPAMP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(ShiftParser.GT, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitComparisonExpression(this);
		}
	}
	public static class PrefixExpressionContext extends ExpressionContext {
		public TerminalNode PLUSPLUS() { return getToken(ShiftParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(ShiftParser.SUBSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitPrefixExpression(this);
		}
	}
	public static class IntExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ShiftParser.INTEGER_LITERAL, 0); }
		public IntExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitIntExpression(this);
		}
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BAREQ() { return getToken(ShiftParser.BAREQ, 0); }
		public TerminalNode AMP() { return getToken(ShiftParser.AMP, 0); }
		public TerminalNode BAR() { return getToken(ShiftParser.BAR, 0); }
		public TerminalNode CARETEQ() { return getToken(ShiftParser.CARETEQ, 0); }
		public TerminalNode CARET() { return getToken(ShiftParser.CARET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode AMPEQ() { return getToken(ShiftParser.AMPEQ, 0); }
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitBitwiseExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			switch (_input.LA(1)) {
			case PLUS:
			case SUB:
			case BANG:
			case TILDE:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << SUB) | (1L << BANG) | (1L << TILDE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(117); expression(15);
				}
				break;
			case PLUSPLUS:
			case SUBSUB:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(119); expression(14);
				}
				break;
			case DEF:
				{
				_localctx = new DeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120); match(DEF);
				setState(121); match(IDENTIFIER);
				setState(122); match(EQ);
				setState(123); expression(8);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124); match(LPAREN);
				setState(125); expression(0);
				setState(126); match(RPAREN);
				}
				break;
			case STRING_LITERAL:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); match(STRING_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				{
				_localctx = new IntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				{
				_localctx = new FloatExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132); match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(NULL);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(138);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERCENT) | (1L << PLUS) | (1L << SUB) | (1L << STAR) | (1L << SLASH) | (1L << STARSTAR) | (1L << LTLT) | (1L << GTGT) | (1L << GTGTGT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(139); expression(13);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(141);
						_la = _input.LA(1);
						if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (EQEQ - 43)) | (1L << (SPACESHIP - 43)) | (1L << (AMPAMP - 43)) | (1L << (BARBAR - 43)) | (1L << (BANGEQ - 43)) | (1L << (GT - 43)) | (1L << (LT - 43)) | (1L << (LTE - 43)) | (1L << (GTE - 43)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(142); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(144);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMP) | (1L << BAR) | (1L << CARET) | (1L << AMPEQ) | (1L << BAREQ) | (1L << CARETEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(145); expression(11);
						}
						break;

					case 4:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147); match(EQ);
						setState(148); expression(10);
						}
						break;

					case 5:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(155);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(150); match(DOT);
							}
							break;
						case QUESTION:
							{
							setState(151); match(QUESTION);
							setState(152); match(DOT);
							}
							break;
						case STAR:
							{
							setState(153); match(STAR);
							setState(154); match(DOT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(157); match(IDENTIFIER);
						setState(158); match(LPAREN);
						setState(160);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(159); argumentList();
							}
						}

						setState(162); match(RPAREN);
						}
						break;

					case 6:
						{
						_localctx = new FieldAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(169);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(164); match(DOT);
							}
							break;
						case QUESTION:
							{
							setState(165); match(QUESTION);
							setState(166); match(DOT);
							}
							break;
						case STAR:
							{
							setState(167); match(STAR);
							setState(168); match(DOT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(171); match(IDENTIFIER);
						}
						break;

					case 7:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(173); match(LPAREN);
						setState(175);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(174); argumentList();
							}
						}

						setState(177); match(RPAREN);
						}
						break;

					case 8:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(179);
						_la = _input.LA(1);
						if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShiftParser.NEWLINE); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ShiftParser.NEWLINE, i);
		}
		public TerminalNode FOR() { return getToken(ShiftParser.FOR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ShiftParser.SEMI); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(ShiftParser.SEMI, i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(FOR);
			setState(186); match(LPAREN);
			setState(188);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(187); expression(0);
				}
			}

			setState(190); match(SEMI);
			setState(192);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(191); expression(0);
				}
			}

			setState(194); match(SEMI);
			setState(196);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(195); expression(0);
				}
			}

			setState(198); match(RPAREN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(199); match(NEWLINE);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(2);
			setState(207);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(206); blockStatement();
				}
			}

			setState(209); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShiftParser.NEWLINE); }
		public TerminalNode WHILE() { return getToken(ShiftParser.WHILE, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShiftParser.NEWLINE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(WHILE);
			setState(212); match(LPAREN);
			setState(213); expression(0);
			setState(214); match(RPAREN);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(215); match(NEWLINE);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); match(2);
			setState(223);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
				{
				setState(222); blockStatement();
				}
			}

			setState(225); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShiftParser.NEWLINE); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IF() { return getToken(ShiftParser.IF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShiftParser.NEWLINE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(IF);
			setState(228); match(LPAREN);
			setState(229); expression(0);
			setState(230); match(RPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(231); match(NEWLINE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			switch (_input.LA(1)) {
			case 2:
				{
				{
				setState(237); match(2);
				setState(239);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
					{
					setState(238); blockStatement();
					}
				}

				setState(241); match(3);
				}
				}
				break;
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case FOR:
			case WHILE:
			case IF:
			case DEF:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case PLUS:
			case SUB:
			case BANG:
			case TILDE:
			case PLUSPLUS:
			case SUBSUB:
			case IDENTIFIER:
				{
				setState(242); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245); match(NEWLINE);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(251); elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShiftParser.NEWLINE); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ShiftParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(ShiftParser.ELSE, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(ELSE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(255); match(NEWLINE);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			switch (_input.LA(1)) {
			case 2:
				{
				{
				setState(261); match(2);
				setState(263);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (INTEGER_LITERAL - 4)) | (1L << (FLOAT_LITERAL - 4)) | (1L << (STRING_LITERAL - 4)) | (1L << (NEWLINE - 4)) | (1L << (FOR - 4)) | (1L << (WHILE - 4)) | (1L << (IF - 4)) | (1L << (DEF - 4)) | (1L << (TRUE - 4)) | (1L << (FALSE - 4)) | (1L << (NULL - 4)) | (1L << (LPAREN - 4)) | (1L << (SEMI - 4)) | (1L << (PLUS - 4)) | (1L << (SUB - 4)) | (1L << (BANG - 4)) | (1L << (TILDE - 4)) | (1L << (PLUSPLUS - 4)) | (1L << (SUBSUB - 4)) | (1L << (IDENTIFIER - 4)))) != 0)) {
					{
					setState(262); blockStatement();
					}
				}

				setState(265); match(3);
				}
				}
				break;
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case FOR:
			case WHILE:
			case IF:
			case DEF:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case PLUS:
			case SUB:
			case BANG:
			case TILDE:
			case PLUSPLUS:
			case SUBSUB:
			case IDENTIFIER:
				{
				setState(266); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);

		case 1: return precpred(_ctx, 11);

		case 2: return precpred(_ctx, 10);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 19);

		case 5: return precpred(_ctx, 18);

		case 6: return precpred(_ctx, 17);

		case 7: return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3D\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"D\n\6\3\6\5\6G\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\5\7S\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\n\3\n\3\n\7\nc\n\n\f\n\16"+
		"\nf\13\n\3\13\5\13i\n\13\3\13\6\13l\n\13\r\13\16\13m\3\f\3\f\3\f\3\f\5"+
		"\ft\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\3\r\3\r\5\r\u00a3"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r\3\r\3\r\5\r\u00b2"+
		"\n\r\3\r\3\r\3\r\7\r\u00b7\n\r\f\r\16\r\u00ba\13\r\3\16\3\16\3\16\5\16"+
		"\u00bf\n\16\3\16\3\16\5\16\u00c3\n\16\3\16\3\16\5\16\u00c7\n\16\3\16\3"+
		"\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\5\16\u00d2\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13"+
		"\17\3\17\3\17\5\17\u00e2\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00eb\n\20\f\20\16\20\u00ee\13\20\3\20\3\20\5\20\u00f2\n\20\3\20\3\20"+
		"\5\20\u00f6\n\20\3\20\7\20\u00f9\n\20\f\20\16\20\u00fc\13\20\3\20\5\20"+
		"\u00ff\n\20\3\21\3\21\7\21\u0103\n\21\f\21\16\21\u0106\13\21\3\21\3\21"+
		"\5\21\u010a\n\21\3\21\3\21\5\21\u010e\n\21\3\21\2\3\30\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\b\4\2\n\n\35\35\4\2%&)*\3\2\61\62\5\2$"+
		"(\63\63?A\5\2-\60<>BC\4\2!#8:\u0137\2&\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b"+
		"<\3\2\2\2\n>\3\2\2\2\fJ\3\2\2\2\16V\3\2\2\2\20\\\3\2\2\2\22_\3\2\2\2\24"+
		"k\3\2\2\2\26s\3\2\2\2\30\u0089\3\2\2\2\32\u00bb\3\2\2\2\34\u00d5\3\2\2"+
		"\2\36\u00e5\3\2\2\2 \u0100\3\2\2\2\"%\5\6\4\2#%\7\n\2\2$\"\3\2\2\2$#\3"+
		"\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\2\2\3*"+
		"\3\3\2\2\2+,\t\2\2\2,\5\3\2\2\2-.\7\r\2\2./\7D\2\2/\64\7\4\2\2\60\63\5"+
		"\b\5\2\61\63\5\4\3\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\5\2\28\7\3\2\2"+
		"\29=\5\f\7\2:=\5\n\6\2;=\5\16\b\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\t\3\2"+
		"\2\2>?\7\22\2\2?@\7D\2\2@A\7 \2\2AC\7\4\2\2BD\5\20\t\2CB\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EG\5\24\13\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\5\2\2I\13"+
		"\3\2\2\2JK\7\22\2\2KL\7\23\2\2LM\7 \2\2MO\7\4\2\2NP\5\20\t\2ON\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QS\5\24\13\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\5\2"+
		"\2U\r\3\2\2\2VW\7\22\2\2WZ\7D\2\2XY\7 \2\2Y[\5\30\r\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\17\3\2\2\2\\]\5\22\n\2]^\7\3\2\2^\21\3\2\2\2_d\7D\2\2`a\7\36\2\2"+
		"ac\7D\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2"+
		"\2gi\5\26\f\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\5\4\3\2kh\3\2\2\2lm\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\25\3\2\2\2ot\5\30\r\2pt\5\32\16\2qt\5\34\17"+
		"\2rt\5\36\20\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\27\3\2\2\2uv\b"+
		"\r\1\2vw\t\3\2\2w\u008a\5\30\r\21xy\t\4\2\2y\u008a\5\30\r\20z{\7\22\2"+
		"\2{|\7D\2\2|}\7 \2\2}\u008a\5\30\r\n~\177\7\31\2\2\177\u0080\5\30\r\2"+
		"\u0080\u0081\7\32\2\2\u0081\u008a\3\2\2\2\u0082\u008a\7\b\2\2\u0083\u008a"+
		"\7\6\2\2\u0084\u008a\7\7\2\2\u0085\u008a\7\26\2\2\u0086\u008a\7\27\2\2"+
		"\u0087\u008a\7\30\2\2\u0088\u008a\7D\2\2\u0089u\3\2\2\2\u0089x\3\2\2\2"+
		"\u0089z\3\2\2\2\u0089~\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2"+
		"\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u00b8\3\2\2\2\u008b\u008c\f\16\2\2"+
		"\u008c\u008d\t\5\2\2\u008d\u00b7\5\30\r\17\u008e\u008f\f\r\2\2\u008f\u0090"+
		"\t\6\2\2\u0090\u00b7\5\30\r\16\u0091\u0092\f\f\2\2\u0092\u0093\t\7\2\2"+
		"\u0093\u00b7\5\30\r\r\u0094\u0095\f\13\2\2\u0095\u0096\7 \2\2\u0096\u00b7"+
		"\5\30\r\f\u0097\u009d\f\25\2\2\u0098\u009e\7\37\2\2\u0099\u009a\7+\2\2"+
		"\u009a\u009e\7\37\2\2\u009b\u009c\7\'\2\2\u009c\u009e\7\37\2\2\u009d\u0098"+
		"\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7D\2\2\u00a0\u00a2\7\31\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a1\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b7\7\32\2\2\u00a5"+
		"\u00ab\f\24\2\2\u00a6\u00ac\7\37\2\2\u00a7\u00a8\7+\2\2\u00a8\u00ac\7"+
		"\37\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ac\7\37\2\2\u00ab\u00a6\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b7\7D"+
		"\2\2\u00ae\u00af\f\23\2\2\u00af\u00b1\7\31\2\2\u00b0\u00b2\5\22\n\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\7\32"+
		"\2\2\u00b4\u00b5\f\17\2\2\u00b5\u00b7\t\4\2\2\u00b6\u008b\3\2\2\2\u00b6"+
		"\u008e\3\2\2\2\u00b6\u0091\3\2\2\2\u00b6\u0094\3\2\2\2\u00b6\u0097\3\2"+
		"\2\2\u00b6\u00a5\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\31\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00be\7\31\2\2\u00bd"+
		"\u00bf\5\30\r\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c2\7\35\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\7\35\2\2\u00c5\u00c7\5"+
		"\30\r\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cc\7\32\2\2\u00c9\u00cb\7\n\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\7\4\2\2\u00d0\u00d2\5\24\13\2\u00d1\u00d0\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\5\2\2\u00d4"+
		"\33\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8\5\30"+
		"\r\2\u00d8\u00dc\7\32\2\2\u00d9\u00db\7\n\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\7\4\2\2\u00e0\u00e2\5\24\13\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\5"+
		"\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\7\31\2\2\u00e7"+
		"\u00e8\5\30\r\2\u00e8\u00ec\7\32\2\2\u00e9\u00eb\7\n\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f5\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\4\2\2\u00f0\u00f2\5\24"+
		"\13\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\7\5\2\2\u00f4\u00f6\5\26\f\2\u00f5\u00ef\3\2\2\2\u00f5\u00f4\3"+
		"\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\7\n\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\5 \21\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100\u0104\7\21\2\2\u0101\u0103\7\n\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u010d\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\4\2\2\u0108"+
		"\u010a\5\24\13\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010e\7\5\2\2\u010c\u010e\5\26\f\2\u010d\u0107\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e!\3\2\2\2&$&\62\64<CFORZdhms\u0089\u009d\u00a2\u00ab"+
		"\u00b1\u00b6\u00b8\u00be\u00c2\u00c6\u00cc\u00d1\u00dc\u00e1\u00ec\u00f1"+
		"\u00f5\u00fa\u00fe\u0104\u0109\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}