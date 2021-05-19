package parser;

import ANTLRules.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

public class MyListener extends TP1BaseListener {
    private boolean saveEnabled;
    private LinkedList<String> tokenList;
    private ContextList ctxList;

    public MyListener() {
        super();
        this.saveEnabled = false;
        this.tokenList = new LinkedList<>();
        this.ctxList = ContextList.getInstance();
    }
    
    @Override
    public void enterS(@NotNull TP1Parser.SContext ctx) {
        this.ctxList.addFirst(new Context());
    }

    @Override
    public void exitS(@NotNull TP1Parser.SContext ctx) {
        System.out.println(ctxList.getFirst().toString());
        this.ctxList.removeFirst();
    }

    @Override
    public void enterDeclarations(@NotNull TP1Parser.DeclarationsContext ctx) {
        this.saveEnabled = true;
    }

    @Override
    public void exitDeclarations(@NotNull TP1Parser.DeclarationsContext ctx) {
//        System.out.println(this.tokenList.toString());

        String data_type = this.tokenList.pop();
        while(this.tokenList.size() > 0) {
            VariableSymbol s;
            String id;
            if(this.tokenList.get(1).equals(",")) {
                id = this.tokenList.pop();
                this.tokenList.pop(); // comma or semicolon

                s = new VariableSymbol(id, data_type, false, false);
            } else {
                id = this.tokenList.pop();
                this.tokenList.pop(); // equals
                this.tokenList.pop(); // value
                this.tokenList.pop(); // comma or semicolon

                s = new VariableSymbol(id, data_type, true, false);
            }

            this.ctxList.getFirst().put(id, s);
        }

        this.tokenList.clear();
        this.saveEnabled = false;
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        if (this.saveEnabled) {
            this.tokenList.add(node.getSymbol().getText());
        }
    }
}