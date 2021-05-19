// Generated from TP1.g4 by ANTLR 4.7.2

  package ANTLRules;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CURLY_BRACKET_OPEN=3, CURLY_BRACKET_CLOSE=4, SQUARE_BRACKET_OPEN=5, 
		SQUARE_BRACKET_CLOSE=6, PARENS_OPEN=7, PARENS_CLOSE=8, SEMICOLON=9, COMMA=10, 
		EQUALS=11, COMPARISON=12, MINOR_THAN=13, MINOR_OR_EQUAL_THAN=14, GREATER_OR_EQUAL_THAN=15, 
		GREATER_THAN=16, ADDITION=17, SUBSTRACTION=18, PRODUCT=19, DIVISION=20, 
		MODULE=21, AND=22, OR=23, NOT=24, DATA_TYPE_CHAR=25, DATA_TYPE_SHORT=26, 
		DATA_TYPE_INT=27, DATA_TYPE_LONG=28, DATA_TYPE_FLOAT=29, DATA_TYPE_DOUBLE=30, 
		DATA_TYPE_VOID=31, CS_IF=32, CS_FOR=33, CS_WHILE=34, IDENTIFIER=35, COMMENT=36, 
		WS=37;
	public static final int
		RULE_s = 0, RULE_instructions = 1, RULE_assignation = 2, RULE_code_block = 3, 
		RULE_data_type = 4, RULE_arithmetic_operator = 5, RULE_logical_operator = 6, 
		RULE_expression = 7, RULE_token_expression = 8, RULE_logical_expression = 9, 
		RULE_arithmetical_operation = 10, RULE_logical_operation = 11, RULE_variable_declaration = 12, 
		RULE_variable_list = 13, RULE_declarations = 14, RULE_parameter_list = 15, 
		RULE_parameter_list_for_function_declaration = 16, RULE_function_declaration = 17, 
		RULE_function_definition = 18, RULE_function = 19, RULE_if_structure = 20, 
		RULE_while_structure = 21, RULE_for_initialization = 22, RULE_for_expression = 23, 
		RULE_for_structure = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instructions", "assignation", "code_block", "data_type", "arithmetic_operator", 
			"logical_operator", "expression", "token_expression", "logical_expression", 
			"arithmetical_operation", "logical_operation", "variable_declaration", 
			"variable_list", "declarations", "parameter_list", "parameter_list_for_function_declaration", 
			"function_declaration", "function_definition", "function", "if_structure", 
			"while_structure", "for_initialization", "for_expression", "for_structure"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'='", "'=='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'void'", "'if'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", 
			"SQUARE_BRACKET_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "SEMICOLON", "COMMA", 
			"EQUALS", "COMPARISON", "MINOR_THAN", "MINOR_OR_EQUAL_THAN", "GREATER_OR_EQUAL_THAN", 
			"GREATER_THAN", "ADDITION", "SUBSTRACTION", "PRODUCT", "DIVISION", "MODULE", 
			"AND", "OR", "NOT", "DATA_TYPE_CHAR", "DATA_TYPE_SHORT", "DATA_TYPE_INT", 
			"DATA_TYPE_LONG", "DATA_TYPE_FLOAT", "DATA_TYPE_DOUBLE", "DATA_TYPE_VOID", 
			"CS_IF", "CS_FOR", "CS_WHILE", "IDENTIFIER", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TP1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TP1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			instructions();
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

	public static class InstructionsContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TP1Parser.SEMICOLON, 0); }
		public If_structureContext if_structure() {
			return getRuleContext(If_structureContext.class,0);
		}
		public While_structureContext while_structure() {
			return getRuleContext(While_structureContext.class,0);
		}
		public For_structureContext for_structure() {
			return getRuleContext(For_structureContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declarations();
				setState(53);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				code_block();
				setState(56);
				instructions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				function();
				setState(59);
				instructions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				assignation();
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				if_structure();
				setState(65);
				instructions();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				while_structure();
				setState(68);
				instructions();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				for_structure();
				setState(71);
				instructions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
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

	public static class AssignationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TP1Parser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(EQUALS);
			setState(78);
			expression();
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode CURLY_BRACKET_OPEN() { return getToken(TP1Parser.CURLY_BRACKET_OPEN, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CURLY_BRACKET_CLOSE() { return getToken(TP1Parser.CURLY_BRACKET_CLOSE, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CURLY_BRACKET_OPEN);
			setState(81);
			instructions();
			setState(82);
			match(CURLY_BRACKET_CLOSE);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE_CHAR() { return getToken(TP1Parser.DATA_TYPE_CHAR, 0); }
		public TerminalNode DATA_TYPE_DOUBLE() { return getToken(TP1Parser.DATA_TYPE_DOUBLE, 0); }
		public TerminalNode DATA_TYPE_FLOAT() { return getToken(TP1Parser.DATA_TYPE_FLOAT, 0); }
		public TerminalNode DATA_TYPE_INT() { return getToken(TP1Parser.DATA_TYPE_INT, 0); }
		public TerminalNode DATA_TYPE_LONG() { return getToken(TP1Parser.DATA_TYPE_LONG, 0); }
		public TerminalNode DATA_TYPE_SHORT() { return getToken(TP1Parser.DATA_TYPE_SHORT, 0); }
		public TerminalNode DATA_TYPE_VOID() { return getToken(TP1Parser.DATA_TYPE_VOID, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATA_TYPE_CHAR) | (1L << DATA_TYPE_SHORT) | (1L << DATA_TYPE_INT) | (1L << DATA_TYPE_LONG) | (1L << DATA_TYPE_FLOAT) | (1L << DATA_TYPE_DOUBLE) | (1L << DATA_TYPE_VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(TP1Parser.ADDITION, 0); }
		public TerminalNode SUBSTRACTION() { return getToken(TP1Parser.SUBSTRACTION, 0); }
		public TerminalNode DIVISION() { return getToken(TP1Parser.DIVISION, 0); }
		public TerminalNode PRODUCT() { return getToken(TP1Parser.PRODUCT, 0); }
		public TerminalNode MODULE() { return getToken(TP1Parser.MODULE, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitArithmetic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitArithmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION) | (1L << SUBSTRACTION) | (1L << PRODUCT) | (1L << DIVISION) | (1L << MODULE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode COMPARISON() { return getToken(TP1Parser.COMPARISON, 0); }
		public TerminalNode MINOR_THAN() { return getToken(TP1Parser.MINOR_THAN, 0); }
		public TerminalNode MINOR_OR_EQUAL_THAN() { return getToken(TP1Parser.MINOR_OR_EQUAL_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(TP1Parser.GREATER_OR_EQUAL_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(TP1Parser.GREATER_THAN, 0); }
		public TerminalNode AND() { return getToken(TP1Parser.AND, 0); }
		public TerminalNode OR() { return getToken(TP1Parser.OR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPARISON) | (1L << MINOR_THAN) | (1L << MINOR_OR_EQUAL_THAN) | (1L << GREATER_OR_EQUAL_THAN) | (1L << GREATER_THAN) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Arithmetical_operationContext arithmetical_operation() {
			return getRuleContext(Arithmetical_operationContext.class,0);
		}
		public Token_expressionContext token_expression() {
			return getRuleContext(Token_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				arithmetical_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				token_expression();
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

	public static class Token_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(TP1Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TP1Parser.FLOAT, 0); }
		public Token_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterToken_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitToken_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitToken_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_expressionContext token_expression() throws RecognitionException {
		Token_expressionContext _localctx = new Token_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_token_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public Token_expressionContext token_expression() {
			return getRuleContext(Token_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TP1Parser.NOT, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical_expression);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				token_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(NOT);
				setState(98);
				token_expression();
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

	public static class Arithmetical_operationContext extends ParserRuleContext {
		public Token_expressionContext token_expression() {
			return getRuleContext(Token_expressionContext.class,0);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Arithmetical_operationContext arithmetical_operation() {
			return getRuleContext(Arithmetical_operationContext.class,0);
		}
		public Arithmetical_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetical_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterArithmetical_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitArithmetical_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitArithmetical_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetical_operationContext arithmetical_operation() throws RecognitionException {
		Arithmetical_operationContext _localctx = new Arithmetical_operationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithmetical_operation);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				token_expression();
				setState(102);
				arithmetic_operator();
				setState(103);
				arithmetical_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				token_expression();
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

	public static class Logical_operationContext extends ParserRuleContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public Logical_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterLogical_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitLogical_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitLogical_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operationContext logical_operation() throws RecognitionException {
		Logical_operationContext _localctx = new Logical_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logical_operation);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				logical_expression();
				setState(109);
				logical_operator();
				setState(110);
				logical_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				logical_expression();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_declaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				assignation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IDENTIFIER);
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

	public static class Variable_listContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TP1Parser.COMMA, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitVariable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitVariable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_list);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				variable_declaration();
				setState(120);
				match(COMMA);
				setState(121);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				variable_declaration();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TP1Parser.SEMICOLON, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			data_type();
			setState(127);
			variable_list();
			setState(128);
			match(SEMICOLON);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(TP1Parser.COMMA, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter_list);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				data_type();
				setState(131);
				match(IDENTIFIER);
				setState(132);
				match(COMMA);
				setState(133);
				parameter_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				data_type();
				setState(136);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Parameter_list_for_function_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TP1Parser.COMMA, 0); }
		public Parameter_list_for_function_declarationContext parameter_list_for_function_declaration() {
			return getRuleContext(Parameter_list_for_function_declarationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public Parameter_list_for_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list_for_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterParameter_list_for_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitParameter_list_for_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitParameter_list_for_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_list_for_function_declarationContext parameter_list_for_function_declaration() throws RecognitionException {
		Parameter_list_for_function_declarationContext _localctx = new Parameter_list_for_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter_list_for_function_declaration);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				data_type();
				setState(142);
				match(COMMA);
				setState(143);
				parameter_list_for_function_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				data_type();
				setState(146);
				match(IDENTIFIER);
				setState(147);
				match(COMMA);
				setState(148);
				parameter_list_for_function_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				data_type();
				setState(151);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				data_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public TerminalNode PARENS_OPEN() { return getToken(TP1Parser.PARENS_OPEN, 0); }
		public Parameter_list_for_function_declarationContext parameter_list_for_function_declaration() {
			return getRuleContext(Parameter_list_for_function_declarationContext.class,0);
		}
		public TerminalNode PARENS_CLOSE() { return getToken(TP1Parser.PARENS_CLOSE, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_declaration);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				data_type();
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(PARENS_OPEN);
				setState(161);
				parameter_list_for_function_declaration();
				setState(162);
				match(PARENS_CLOSE);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public TerminalNode PARENS_OPEN() { return getToken(TP1Parser.PARENS_OPEN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode PARENS_CLOSE() { return getToken(TP1Parser.PARENS_CLOSE, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			data_type();
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(PARENS_OPEN);
			setState(169);
			parameter_list();
			setState(170);
			match(PARENS_CLOSE);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TP1Parser.SEMICOLON, 0); }
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				function_declaration();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				function_definition();
				setState(176);
				code_block();
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

	public static class If_structureContext extends ParserRuleContext {
		public TerminalNode CS_IF() { return getToken(TP1Parser.CS_IF, 0); }
		public TerminalNode PARENS_OPEN() { return getToken(TP1Parser.PARENS_OPEN, 0); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public TerminalNode PARENS_CLOSE() { return getToken(TP1Parser.PARENS_CLOSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterIf_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitIf_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitIf_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structureContext if_structure() throws RecognitionException {
		If_structureContext _localctx = new If_structureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CS_IF);
			setState(181);
			match(PARENS_OPEN);
			setState(182);
			logical_operation();
			setState(183);
			match(PARENS_CLOSE);
			setState(184);
			code_block();
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

	public static class While_structureContext extends ParserRuleContext {
		public TerminalNode CS_WHILE() { return getToken(TP1Parser.CS_WHILE, 0); }
		public TerminalNode PARENS_OPEN() { return getToken(TP1Parser.PARENS_OPEN, 0); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public TerminalNode PARENS_CLOSE() { return getToken(TP1Parser.PARENS_CLOSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterWhile_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitWhile_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitWhile_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_structureContext while_structure() throws RecognitionException {
		While_structureContext _localctx = new While_structureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CS_WHILE);
			setState(187);
			match(PARENS_OPEN);
			setState(188);
			logical_operation();
			setState(189);
			match(PARENS_CLOSE);
			setState(190);
			code_block();
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

	public static class For_initializationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public Token_expressionContext token_expression() {
			return getRuleContext(Token_expressionContext.class,0);
		}
		public For_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFor_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFor_initialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFor_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializationContext for_initialization() throws RecognitionException {
		For_initializationContext _localctx = new For_initializationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_initialization);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				data_type();
				setState(193);
				assignation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				assignation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				token_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class For_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TP1Parser.IDENTIFIER, 0); }
		public List<TerminalNode> ADDITION() { return getTokens(TP1Parser.ADDITION); }
		public TerminalNode ADDITION(int i) {
			return getToken(TP1Parser.ADDITION, i);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_expression);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(IDENTIFIER);
				setState(201);
				match(ADDITION);
				setState(202);
				match(ADDITION);
				}
				break;
			case PARENS_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class For_structureContext extends ParserRuleContext {
		public TerminalNode CS_FOR() { return getToken(TP1Parser.CS_FOR, 0); }
		public TerminalNode PARENS_OPEN() { return getToken(TP1Parser.PARENS_OPEN, 0); }
		public For_initializationContext for_initialization() {
			return getRuleContext(For_initializationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TP1Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TP1Parser.SEMICOLON, i);
		}
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public TerminalNode PARENS_CLOSE() { return getToken(TP1Parser.PARENS_CLOSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFor_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFor_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFor_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_structureContext for_structure() throws RecognitionException {
		For_structureContext _localctx = new For_structureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CS_FOR);
			setState(207);
			match(PARENS_OPEN);
			setState(208);
			for_initialization();
			setState(209);
			match(SEMICOLON);
			setState(210);
			logical_operation();
			setState(211);
			match(SEMICOLON);
			setState(212);
			for_expression();
			setState(213);
			match(PARENS_CLOSE);
			setState(214);
			code_block();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\5\13f\n\13\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\3\r\5\rt\n"+
		"\r\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\5\17\177\n\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008e"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u009e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a7\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b5"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00c9\n\30\3\31\3\31\3\31\3\31\5\31\u00cf"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\33!\3\2\23"+
		"\27\4\2\16\22\30\31\4\2\3\4%%\2\u00da\2\64\3\2\2\2\4L\3\2\2\2\6N\3\2\2"+
		"\2\bR\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22`\3\2\2"+
		"\2\24e\3\2\2\2\26l\3\2\2\2\30s\3\2\2\2\32w\3\2\2\2\34~\3\2\2\2\36\u0080"+
		"\3\2\2\2 \u008d\3\2\2\2\"\u009d\3\2\2\2$\u00a6\3\2\2\2&\u00a8\3\2\2\2"+
		"(\u00b4\3\2\2\2*\u00b6\3\2\2\2,\u00bc\3\2\2\2.\u00c8\3\2\2\2\60\u00ce"+
		"\3\2\2\2\62\u00d0\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\66\67\5\36\20\2\67"+
		"8\5\4\3\28M\3\2\2\29:\5\b\5\2:;\5\4\3\2;M\3\2\2\2<=\5(\25\2=>\5\4\3\2"+
		">M\3\2\2\2?@\5\6\4\2@A\7\13\2\2AM\3\2\2\2BC\5*\26\2CD\5\4\3\2DM\3\2\2"+
		"\2EF\5,\27\2FG\5\4\3\2GM\3\2\2\2HI\5\62\32\2IJ\5\4\3\2JM\3\2\2\2KM\3\2"+
		"\2\2L\66\3\2\2\2L9\3\2\2\2L<\3\2\2\2L?\3\2\2\2LB\3\2\2\2LE\3\2\2\2LH\3"+
		"\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7%\2\2OP\7\r\2\2PQ\5\20\t\2Q\7\3\2\2\2R"+
		"S\7\5\2\2ST\5\4\3\2TU\7\6\2\2U\t\3\2\2\2VW\t\2\2\2W\13\3\2\2\2XY\t\3\2"+
		"\2Y\r\3\2\2\2Z[\t\4\2\2[\17\3\2\2\2\\_\5\26\f\2]_\5\22\n\2^\\\3\2\2\2"+
		"^]\3\2\2\2_\21\3\2\2\2`a\t\5\2\2a\23\3\2\2\2bf\5\22\n\2cd\7\32\2\2df\5"+
		"\22\n\2eb\3\2\2\2ec\3\2\2\2f\25\3\2\2\2gh\5\22\n\2hi\5\f\7\2ij\5\26\f"+
		"\2jm\3\2\2\2km\5\22\n\2lg\3\2\2\2lk\3\2\2\2m\27\3\2\2\2no\5\24\13\2op"+
		"\5\16\b\2pq\5\30\r\2qt\3\2\2\2rt\5\24\13\2sn\3\2\2\2sr\3\2\2\2t\31\3\2"+
		"\2\2ux\5\6\4\2vx\7%\2\2wu\3\2\2\2wv\3\2\2\2x\33\3\2\2\2yz\5\32\16\2z{"+
		"\7\f\2\2{|\5\34\17\2|\177\3\2\2\2}\177\5\32\16\2~y\3\2\2\2~}\3\2\2\2\177"+
		"\35\3\2\2\2\u0080\u0081\5\n\6\2\u0081\u0082\5\34\17\2\u0082\u0083\7\13"+
		"\2\2\u0083\37\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086\7%\2\2\u0086\u0087"+
		"\7\f\2\2\u0087\u0088\5 \21\2\u0088\u008e\3\2\2\2\u0089\u008a\5\n\6\2\u008a"+
		"\u008b\7%\2\2\u008b\u008e\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0084\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e!\3\2\2\2\u008f\u0090"+
		"\5\n\6\2\u0090\u0091\7\f\2\2\u0091\u0092\5\"\22\2\u0092\u009e\3\2\2\2"+
		"\u0093\u0094\5\n\6\2\u0094\u0095\7%\2\2\u0095\u0096\7\f\2\2\u0096\u0097"+
		"\5\"\22\2\u0097\u009e\3\2\2\2\u0098\u0099\5\n\6\2\u0099\u009a\7%\2\2\u009a"+
		"\u009e\3\2\2\2\u009b\u009e\5\n\6\2\u009c\u009e\3\2\2\2\u009d\u008f\3\2"+
		"\2\2\u009d\u0093\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e#\3\2\2\2\u009f\u00a7\5&\24\2\u00a0\u00a1\5\n\6\2"+
		"\u00a1\u00a2\7%\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5"+
		"\7\n\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7"+
		"%\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7\t\2\2\u00ab"+
		"\u00ac\5 \21\2\u00ac\u00ad\7\n\2\2\u00ad\'\3\2\2\2\u00ae\u00af\5$\23\2"+
		"\u00af\u00b0\7\13\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3"+
		"\5\b\5\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		")\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\5\30\r\2"+
		"\u00b9\u00ba\7\n\2\2\u00ba\u00bb\5\b\5\2\u00bb+\3\2\2\2\u00bc\u00bd\7"+
		"$\2\2\u00bd\u00be\7\t\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\7\n\2\2\u00c0"+
		"\u00c1\5\b\5\2\u00c1-\3\2\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\5\6\4\2"+
		"\u00c4\u00c9\3\2\2\2\u00c5\u00c9\5\6\4\2\u00c6\u00c9\5\22\n\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9/\3\2\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\7\23\2\2"+
		"\u00cc\u00cf\7\23\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\61\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7\t\2\2\u00d2"+
		"\u00d3\5.\30\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7"+
		"\13\2\2\u00d6\u00d7\5\60\31\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\b\5\2"+
		"\u00d9\63\3\2\2\2\17L^elsw~\u008d\u009d\u00a6\u00b4\u00c8\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}