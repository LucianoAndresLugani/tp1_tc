// Generated from TP1.g4 by ANTLR 4.7.2

  package ANTLRules;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TP1Parser}.
 */
public interface TP1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TP1Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(TP1Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(TP1Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TP1Parser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TP1Parser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(TP1Parser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(TP1Parser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(TP1Parser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(TP1Parser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TP1Parser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TP1Parser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(TP1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(TP1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(TP1Parser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(TP1Parser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TP1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TP1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#token_expression}.
	 * @param ctx the parse tree
	 */
	void enterToken_expression(TP1Parser.Token_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#token_expression}.
	 * @param ctx the parse tree
	 */
	void exitToken_expression(TP1Parser.Token_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(TP1Parser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(TP1Parser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#arithmetical_operation}.
	 * @param ctx the parse tree
	 */
	void enterArithmetical_operation(TP1Parser.Arithmetical_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#arithmetical_operation}.
	 * @param ctx the parse tree
	 */
	void exitArithmetical_operation(TP1Parser.Arithmetical_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operation(TP1Parser.Logical_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operation(TP1Parser.Logical_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(TP1Parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(TP1Parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(TP1Parser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(TP1Parser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(TP1Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(TP1Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(TP1Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(TP1Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#parameter_list_for_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list_for_function_declaration(TP1Parser.Parameter_list_for_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#parameter_list_for_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list_for_function_declaration(TP1Parser.Parameter_list_for_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(TP1Parser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(TP1Parser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(TP1Parser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(TP1Parser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TP1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TP1Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#if_structure}.
	 * @param ctx the parse tree
	 */
	void enterIf_structure(TP1Parser.If_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#if_structure}.
	 * @param ctx the parse tree
	 */
	void exitIf_structure(TP1Parser.If_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#while_structure}.
	 * @param ctx the parse tree
	 */
	void enterWhile_structure(TP1Parser.While_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#while_structure}.
	 * @param ctx the parse tree
	 */
	void exitWhile_structure(TP1Parser.While_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterFor_initialization(TP1Parser.For_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitFor_initialization(TP1Parser.For_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#for_expression}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression(TP1Parser.For_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#for_expression}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression(TP1Parser.For_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#for_structure}.
	 * @param ctx the parse tree
	 */
	void enterFor_structure(TP1Parser.For_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#for_structure}.
	 * @param ctx the parse tree
	 */
	void exitFor_structure(TP1Parser.For_structureContext ctx);
}