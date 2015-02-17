package scanner;

import core.Token;

import java.util.ArrayList;

/**
 * Created by Christina Dunning on 2/4/2015.
 */
public class mp {
    public static void main(String[] args) {
        ArrayList<Token> tokens = new ArrayList<Token>();
        Token token = null;
        if(args.length==1) {
            String filename = args[0];
            Dispatcher s = new Dispatcher(filename);
            while(token!= Token.MP_EOF && token != Token.MP_RUN_COMMENT && token != Token.MP_RUN_STRING && token != Token.MP_ERROR) {
                token = s.getToken();
                tokens.add(token);
                System.out.println();
                System.out.print("Token "+ token.name());
                System.out.print(", Lexeme  \""+s.getLexeme()+"\"");
                System.out.print(", Line "+s.getLine());
                System.out.print(", Column "+s.getColumn());
            }
        }
        else {
            System.out.println("One argument expected. " + args.length + " found.");
        }
    }
}
