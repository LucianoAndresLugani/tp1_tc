package parser;

import java.io.IOException;
import java.util.LinkedList;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ANTLRules.*;


public class Main {
    private LinkedList<Context> contextList;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // create a CharStream that reads from file
        ANTLRFileStream input = new ANTLRFileStream("./CodigoFuenteEjemplo.c");

        // create a lexer that feeds off of input CharStream
        TP1Lexer lexer = new TP1Lexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        TP1Parser parser = new TP1Parser(tokens);
        
        // Creo el objeto que tiene los Listeners
//        TP1BaseListener escucha = new TP1BaseListener();
        TP1BaseListener escucha = new MyListener();
        
        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);
        
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = parser.s();

        // Imprime el arbol obtenido
//        System.out.println(tree.toStringTree(parser));
    }
}
