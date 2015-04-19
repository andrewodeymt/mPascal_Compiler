package parser;
import java.util.HashMap;
import java.util.Map;

public class RuleLookup {
    private static final HashMap<Integer, String> rules = new HashMap<Integer, String>();
    static {
        rules.put(1, "<SystemGoal> ⟶ <Progrm>");
        rules.put(2, "<Progrm> ⟶ <ProgramHeading>");
        rules.put(3, "<ProgramHeading> ⟶ program");
        rules.put(4, "<Block> ⟶ <VariableDeclarationPart>");
        rules.put(5, "<VariableDeclarationPart> ⟶ var");
        rules.put(6, "<VariableDeclarationPart> ⟶ lambda");
        rules.put(7, "<VariableDeclarationTail> ⟶ <VariableDeclaration>");
        rules.put(8, "<VariableDeclarationTail> ⟶ lambda");
        rules.put(9, "<VariableDeclaration> ⟶ <IdentifierList>");
        rules.put(10, "<Type> ⟶ Integer");
        rules.put(11, "<Type> ⟶ Float");
        rules.put(12, "<Type> ⟶ String");
        rules.put(13, "<Type> ⟶ Boolean");
        rules.put(14, "<ProcedureAndFunctionDeclarationPart> ⟶ <ProcedureDeclaration>");
        rules.put(15, "<ProcedureAndFunctionDeclarationPart> ⟶ <FunctionDeclaration>");
        rules.put(16, "<ProcedureAndFunctionDeclarationPart> ⟶ lambda");
        rules.put(17, "<ProcedureDeclaration> ⟶ <ProcedureHeading>");
        rules.put(18, "<FunctionDeclaration> ⟶ <FunctionHeading>");
        rules.put(19, "<ProcedureHeading> ⟶ procedure");
        rules.put(20, "<FunctionHeading> ⟶ function");
        rules.put(21, "<OptionalFormalParameterList> ⟶ (");
        rules.put(22, "<OptionalFormalParameterList> ⟶ lambda");
        rules.put(23, "<FormalParameterSectionTail> ⟶ ;");
        rules.put(24, "<FormalParameterSectionTail> ⟶ lambda");
        rules.put(25, "<FormalParameterSection> ⟶ <ValueParameterSection>");
        rules.put(26, "<FormalParameterSection> ⟶ <VariableParameterSection>");
        rules.put(27, "<ValueParameterSection> ⟶ <IdentifierList>");
        rules.put(28, "<VariableParameterSection> ⟶ var");
        rules.put(29, "<StatementPart> ⟶ <CompoundStatement>");
        rules.put(30, "<CompoundStatement> ⟶ begin");
        rules.put(31, "<StatementSequence> ⟶ <Statement>");
        rules.put(32, "<StatementTail> ⟶ ;");
        rules.put(33, "<StatementTail> ⟶ lambda");
        rules.put(34, "<Statement> ⟶ <EmptyStatement>");
        rules.put(35, "<Statement> ⟶ <CompoundStatement>");
        rules.put(36, "<Statement> ⟶ <ReadStatement>");
        rules.put(37, "<Statement> ⟶ <WriteStatement>");
        rules.put(38, "<Statement> ⟶ <AssignmentStatement>");
        rules.put(39, "<Statement> ⟶ <IfStatement>");
        rules.put(40, "<Statement> ⟶ <WhileStatement>");
        rules.put(41, "<Statement> ⟶ <RepeatStatement>");
        rules.put(42, "<Statement> ⟶ <ForStatement>");
        rules.put(43, "<Statement> ⟶ <ProcedureStatement>");
        rules.put(44, "<EmptyStatement> ⟶ lambda");
        rules.put(45, "<ReadStatement> ⟶ read");
        rules.put(46, "<ReadParameterTail> ⟶ ,");
        rules.put(47, "<ReadParameterTail> ⟶ lambda");
        rules.put(48, "<ReadParameter> ⟶ <VariableIdentifier>");
        rules.put(49, "<WriteStatement> ⟶ write");
        rules.put(50, "<WriteStatement> ⟶ writeln");
        rules.put(51, "<WriteParameterTail> ⟶ ,");
        rules.put(52, "<WriteParameterTail> ⟶ lambda");
        rules.put(53, "<WriteParameter> ⟶ <OrdinalExpression>");
        rules.put(54, "<AssignmentStatement> ⟶ <VariableIdentifier>");
        rules.put(55, "<AssignmentStatement> ⟶ <FunctionIdentifier>");
        rules.put(56, "<IfStatement> ⟶ if");
        rules.put(57, "<OptionalElsePart> ⟶ else");
        rules.put(58, "<OptionalElsePart> ⟶ lambda");
        rules.put(59, "<RepeatStatement> ⟶ repeat");
        rules.put(60, "<WhileStatement> ⟶ while");
        rules.put(61, "<ForStatement> ⟶ for");
        rules.put(62, "<ControlVariable> ⟶ <VariableIdentifier>");
        rules.put(63, "<InitialValue> ⟶ <OrdinalExpression>");
        rules.put(64, "<StepValue> ⟶ to");
        rules.put(65, "<StepValue> ⟶ downto");
        rules.put(66, "<FinalValue> ⟶ <OrdinalExpression>");
        rules.put(67, "<ProcedureStatement> ⟶ <ProcedureIdentifier>");
        rules.put(68, "<OptionalActualParameterList> ⟶ (");
        rules.put(69, "<OptionalActualParameterList> ⟶ lambda");
        rules.put(70, "<ActualParameterTail> ⟶ ,");
        rules.put(71, "<ActualParameterTail> ⟶ lambda");
        rules.put(72, "<ActualParameter> ⟶ <OrdinalExpression>");
        rules.put(73, "<Expression> ⟶ <SimpleExpression>");
        rules.put(74, "<OptionalRelationalPart> ⟶ <RelationalOperator>");
        rules.put(75, "<OptionalRelationalPart> ⟶ lambda");
        rules.put(76, "<RelationalOperator> ⟶ =");
        rules.put(77, "<RelationalOperator> ⟶ <");
        rules.put(78, "<RelationalOperator> ⟶ >");
        rules.put(79, "<RelationalOperator> ⟶ <=");
        rules.put(80, "<RelationalOperator> ⟶ >=");
        rules.put(81, "<RelationalOperator> ⟶ <>");
        rules.put(82, "<SimpleExpression> ⟶ <OptionalSign>");
        rules.put(83, "<TermTail> ⟶ <AddingOperator>");
        rules.put(84, "<TermTail> ⟶ lambda");
        rules.put(85, "<OptionalSign> ⟶ +");
        rules.put(86, "<OptionalSign> ⟶ -");
        rules.put(87, "<OptionalSign> ⟶ lambda");
        rules.put(88, "<AddingOperator> ⟶ +");
        rules.put(89, "<AddingOperator> ⟶ -");
        rules.put(90, "<AddingOperator> ⟶ or");
        rules.put(91, "<Term> ⟶ <Factor>");
        rules.put(92, "<FactorTail> ⟶ <MultiplyingOperator>");
        rules.put(93, "<FactorTail> ⟶ lambda");
        rules.put(94, "<MultiplyingOperator> ⟶ *");
        rules.put(95, "<MultiplyingOperator> ⟶ /");
        rules.put(96, "<MultiplyingOperator> ⟶ div");
        rules.put(97, "<MultiplyingOperator> ⟶ mod");
        rules.put(98, "<MultiplyingOperator> ⟶ and");
        rules.put(99, "<Factor> ⟶ unsignedInteger");
        rules.put(100, "<Factor> ⟶ unsignedFloat");
        rules.put(101, "<Factor> ⟶ stringLiteral");
        rules.put(102, "<Factor> ⟶ 1");
        rules.put(103, "<Factor> ⟶ 0");
        rules.put(104, "<Factor> ⟶ not");
        rules.put(105, "<Factor> ⟶ (");
        rules.put(106, "<Factor> ⟶ <FunctionIdentifier>");
        rules.put(107, "<ProgramIdentifier> ⟶ identifier");
        rules.put(108, "<VariableIdentifier> ⟶ identifier");
        rules.put(109, "<ProcedureIdentifier> ⟶ identifier");
        rules.put(110, "<FunctionIdentifier> ⟶ identifier");
        rules.put(111, "<BooleanExpression> ⟶ <Expression>");
        rules.put(112, "<OrdinalExpression> ⟶ <Expression>");
        rules.put(113, "<IdentifierList> ⟶ identifier");
        rules.put(114, "<IdentifierTail> ⟶ ,");
        rules.put(115, "<IdentifierTail> ⟶ lambda");
        rules.put(116, "<Factor> ⟶ <VariableIdentifier>");
    }
    public static HashMap getRules(){
        return rules;
    }
    }