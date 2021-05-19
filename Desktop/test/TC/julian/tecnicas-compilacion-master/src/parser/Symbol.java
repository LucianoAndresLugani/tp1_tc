package parser;

public class Symbol {
    String id, dataType;
    Boolean initialized, used;

    public Symbol (String id, String dt, boolean init, boolean used) {
        this.id = id;
        this.dataType = dt;
        this.initialized = init;
        this.used = used;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }

    public Boolean isUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public String toString() {
        return "id: " + this.id + ", dt: " + this.dataType + ", init: " + this.initialized + ", used: " + this.used;
    }
}
