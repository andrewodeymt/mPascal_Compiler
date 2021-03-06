package analyzer.operations;

import analyzer.Argument;
import analyzer.SemanticException;
import symbolTable.Type;

public class TimesOp extends StackOperator {
    public TimesOp(Type[] types) {
        super(types);
    }

    @Override
    protected String safeOp(Argument leftArg, Argument rightArg, String label) throws SemanticException {
        assertValue(leftArg, true);
        assertValue(rightArg, true);
        assertValue(label, false);
        Argument.decreaseSP();
        if(leftArg.getType()==Type.INTEGER) {
            return "MULS";
        }
        else {
            return "MULSF";
        }
    }
}
