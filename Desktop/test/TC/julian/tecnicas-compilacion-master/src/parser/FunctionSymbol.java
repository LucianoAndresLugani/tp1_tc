package parser;

import java.util.LinkedList;

public class FunctionSymbol extends Symbol {
    private LinkedList<VariableSymbol> params;
    public FunctionSymbol(String id, String dt, boolean init, boolean used) {
        super(id, dt, init, used);
    }
}