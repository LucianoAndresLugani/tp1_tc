// Generated from TP1.g4 by ANTLR 4.7.2

  package ANTLRules;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TP1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TP1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TP1Parser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(TP1Parser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TP1Parser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(TP1Parser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(TP1Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TP1Parser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operator(TP1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(TP1Parser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TP1Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#token_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expression(TP1Parser.Token_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(TP1Parser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#arithmetical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetical_operation(TP1Parser.Arithmetical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#logical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operation(TP1Parser.Logical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(TP1Parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#variable_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_list(TP1Parser.Variable_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TP1Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(TP1Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#parameter_list_for_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list_for_function_declaration(TP1Parser.Parameter_list_for_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(TP1Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(TP1Parser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TP1Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#if_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_structure(TP1Parser.If_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#while_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_structure(TP1Parser.While_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initialization(TP1Parser.For_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expression(TP1Parser.For_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#for_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_structure(TP1Parser.For_structureContext ctx);
}