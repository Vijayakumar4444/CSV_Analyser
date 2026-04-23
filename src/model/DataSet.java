package model;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    private List<Record> records = new ArrayList<>();

    public void addRecord(Record record) {
        records.add(record);
    }

    public List<Record> getRecords() {
        return records;
    }

    public void display() {

        if (records == null || records.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        for (String key : records.get(0).getKeys()) {
            System.out.print(key + "\t");
        }
        System.out.println();

        for (Record record : records) {
            for (String key : record.getKeys()) {
                System.out.print(record.getValue(key) + "\t");
            }
            System.out.println();
        }
    }
}