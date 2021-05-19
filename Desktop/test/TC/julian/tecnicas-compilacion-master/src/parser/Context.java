package parser;

import java.util.HashMap;
import java.util.LinkedList;

public class Context extends HashMap<String, Symbol> {

    public Context() { }

    @Override
    public String toString() {
        String ret = "================\n";
        for (String key : this.keySet()) {
            ret += this.get(key).toString() + "\n";
        }
        ret += "================\n\n";

        return ret;
    }
}