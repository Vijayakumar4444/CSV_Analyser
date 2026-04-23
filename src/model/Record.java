package model;

import java.util.Map;
import java.util.Set;

public class Record {

    private Map<String, String> data;

    public Record(Map<String, String> data) {
        this.data = data;
    }

    public String getValue(String key) {
        return data.get(key);
    }

    public Set<String> getKeys() {
        return data.keySet();
    }

    public Map<String, String> getAll() {
        return data;
    }
}