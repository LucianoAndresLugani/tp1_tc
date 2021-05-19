package parser;

import java.util.LinkedList;

public class ContextList extends LinkedList<Context> {
    private static ContextList ourInstance = new ContextList();

    public static ContextList getInstance() {
        return ourInstance;
    }

    private ContextList() { }
}
