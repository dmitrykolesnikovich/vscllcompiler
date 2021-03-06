// Generated from /Users/mateusz/Projects/vscllcompiler/src/main/resources/grammar/VSCLL.g4 by ANTLR 4.7.2
package pl.mateuszkalinowski.vscllcompiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VSCLLParser}.
 */
public interface VSCLLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(VSCLLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(VSCLLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#outer_statements}.
	 * @param ctx the parse tree
	 */
	void enterOuter_statements(VSCLLParser.Outer_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#outer_statements}.
	 * @param ctx the parse tree
	 */
	void exitOuter_statements(VSCLLParser.Outer_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(VSCLLParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(VSCLLParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(VSCLLParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(VSCLLParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(VSCLLParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(VSCLLParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VSCLLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VSCLLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(VSCLLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(VSCLLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(VSCLLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(VSCLLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(VSCLLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(VSCLLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(VSCLLParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(VSCLLParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(VSCLLParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(VSCLLParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(VSCLLParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(VSCLLParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#expressions_list}.
	 * @param ctx the parse tree
	 */
	void enterExpressions_list(VSCLLParser.Expressions_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#expressions_list}.
	 * @param ctx the parse tree
	 */
	void exitExpressions_list(VSCLLParser.Expressions_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_less_than}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_less_than(VSCLLParser.Condition_less_thanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_less_than}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_less_than(VSCLLParser.Condition_less_thanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_greater_than}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_greater_than(VSCLLParser.Condition_greater_thanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_greater_than}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_greater_than(VSCLLParser.Condition_greater_thanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_equal}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_equal(VSCLLParser.Condition_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_equal}
	 * labeled alternative in {@link VSCLLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_equal(VSCLLParser.Condition_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(VSCLLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(VSCLLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_character}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_character(VSCLLParser.Expression_characterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_character}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_character(VSCLLParser.Expression_characterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_int}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_int(VSCLLParser.Expression_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_int}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_int(VSCLLParser.Expression_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_function_call}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_function_call(VSCLLParser.Expression_function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_function_call}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_function_call(VSCLLParser.Expression_function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(VSCLLParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(VSCLLParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_to_double}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_to_double(VSCLLParser.Expression_to_doubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_to_double}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_to_double(VSCLLParser.Expression_to_doubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(VSCLLParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(VSCLLParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_to_int}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_to_int(VSCLLParser.Expression_to_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_to_int}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_to_int(VSCLLParser.Expression_to_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_index}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_index(VSCLLParser.Expression_indexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_index}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_index(VSCLLParser.Expression_indexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_id}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_id(VSCLLParser.Expression_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_id}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_id(VSCLLParser.Expression_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_double}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_double(VSCLLParser.Expression_doubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_double}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_double(VSCLLParser.Expression_doubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicate}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicate(VSCLLParser.MultiplicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicate}
	 * labeled alternative in {@link VSCLLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicate(VSCLLParser.MultiplicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_expression}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(VSCLLParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_expression}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(VSCLLParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prints_string}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void enterPrints_string(VSCLLParser.Prints_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prints_string}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void exitPrints_string(VSCLLParser.Prints_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prints_id}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void enterPrints_id(VSCLLParser.Prints_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prints_id}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void exitPrints_id(VSCLLParser.Prints_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prints_id_index}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void enterPrints_id_index(VSCLLParser.Prints_id_indexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prints_id_index}
	 * labeled alternative in {@link VSCLLParser#prints}.
	 * @param ctx the parse tree
	 */
	void exitPrints_id_index(VSCLLParser.Prints_id_indexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scani_id}
	 * labeled alternative in {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void enterScani_id(VSCLLParser.Scani_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scani_id}
	 * labeled alternative in {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void exitScani_id(VSCLLParser.Scani_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scani_array}
	 * labeled alternative in {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void enterScani_array(VSCLLParser.Scani_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scani_array}
	 * labeled alternative in {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void exitScani_array(VSCLLParser.Scani_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scand_id}
	 * labeled alternative in {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void enterScand_id(VSCLLParser.Scand_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scand_id}
	 * labeled alternative in {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void exitScand_id(VSCLLParser.Scand_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scand_array}
	 * labeled alternative in {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void enterScand_array(VSCLLParser.Scand_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scand_array}
	 * labeled alternative in {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void exitScand_array(VSCLLParser.Scand_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_variable}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_variable(VSCLLParser.Declaration_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_variable}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_variable(VSCLLParser.Declaration_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_array}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_array(VSCLLParser.Declaration_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_array}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_array(VSCLLParser.Declaration_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_with_initialization_variable}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_with_initialization_variable}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_with_initialization_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_with_initialization_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing_variable}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssing_variable(VSCLLParser.Assing_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing_variable}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssing_variable(VSCLLParser.Assing_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing_text_pointer}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssing_text_pointer(VSCLLParser.Assing_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing_text_pointer}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssing_text_pointer(VSCLLParser.Assing_text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing_to_array}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssing_to_array(VSCLLParser.Assing_to_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing_to_array}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssing_to_array(VSCLLParser.Assing_to_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(VSCLLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(VSCLLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(VSCLLParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(VSCLLParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#text_pointer}.
	 * @param ctx the parse tree
	 */
	void enterText_pointer(VSCLLParser.Text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#text_pointer}.
	 * @param ctx the parse tree
	 */
	void exitText_pointer(VSCLLParser.Text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(VSCLLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(VSCLLParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(VSCLLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(VSCLLParser.Function_callContext ctx);
}