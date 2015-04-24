package Analyzer;

import core.Token;
import parser.ParseException;
import symbolTable.SymbolTable;
import symbolTable.TableEntry;
import symbolTable.TableStack;
import symbolTable.Type;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by Christina on 4/8/2015.
 */
public class Analyzer {
    private static TableStack tables = TableStack.getStack();
    private static HashMap<Token,HashMap<Type,MachineOp>> opTable;
    private String endline = "\n";

    public Analyzer() {
        addOp(Token.MP_PLUS, Type.INTEGER, MachineOp.Adds);
        addOp(Token.MP_READ, Type.STRING, MachineOp.Read);
    }
    private void addOp(Token token, Type type, MachineOp op) {
        opTable.put(token, new HashMap<Type, MachineOp>(Type.values().length));
        opTable.get(token).put(type, op);

    }

    // take a record (with at least one valid operation and valid operators). Generate and save the code.
    public static void generate(SemanticRecord record) {
        genRecursive(record);
    }
    // recursively descend and generate code from record.

    private static Type genRecursive(SemanticRecord record) {
        Type leftType;
        Type rightType;
        //record.operator;
        if((record.rightOperand.isOperand)&&(record.leftOperand.isOperand)) {
            // start calculation here
            // output = ??
        }
        else {
            if(!record.rightOperand.isOperand) {
                rightType = genRecursive(record.rightOperand);
            }
            else {
                rightType = getType(record.rightOperand.operand);
                // push getSymbol(record.rightOperand.operand) onto stack
            }
            if(!record.leftOperand.isOperand) {
                leftType = genRecursive(record.leftOperand);
            }
            else {
                leftType = getType(record.leftOperand.operand);
                // push getSymbol(record.leftOperand.operand) onto stack
            }
            // continue calculation here
            // ie. do type check and then
            // perform intermediate calculation from stack


        }
        return null;
    }
    private static String getSymbol(String operand) {
        TableEntry entry;
        try {
            entry = tables.getEntry(operand);
            return entry.offset+"(D"+entry.nest+")";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    private static Type getType(String operand) {
        try {
            TableEntry entry  = tables.getEntry(operand);
            return entry.type;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    // search the operation table for the correct machine operator for the given type
    private MachineOp opLookup(Token token, Type type) {
        if(opTable.containsKey(token) && opTable.get(token).containsKey(type)) {
            return opTable.get(token).get(type);
        }
        else {
            return null;
        }
    }
    // print expression out to a file
    private void saveLine(String line) {

    }
    private void Save(String statement) {

    }
    private void MULS(String leftop, String rightop) {
        if(leftop!=null)
            saveLine("PUSH leftop");
        if(rightop!=null)
            saveLine("PUSH rightop");
        saveLine("MULS");

    }
}
