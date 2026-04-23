package service;

import model.Record;
import model.DataSet;

import java.util.HashMap;
import java.util.Map;

public class Analyzer {

    public static void showStatistics(DataSet ds, String column) {

        if (ds == null || ds.getRecords().isEmpty()) {
            return;
        }

        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int count = 0;

        for (Record record : ds.getRecords()) {

            try {
                double value = Double.parseDouble(record.getValue(column));

                sum += value;
                min = Math.min(min, value);
                max = Math.max(max, value);
                count++;

            } catch (Exception e) {
                System.out.println("Column contains non-numeric values.");
                return;
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Average : " + (sum / count));
    }

    public static void frequency(DataSet ds, String column) {

        if (ds == null || ds.getRecords().isEmpty()) {
            return;
        }

        Map<String, Integer> freqMap = new HashMap<>();

        for (Record record : ds.getRecords()) {
            String value = record.getValue(column);
            freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
        }

        for (String key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}