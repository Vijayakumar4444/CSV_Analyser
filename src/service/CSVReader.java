package service;

import model.Record;
import model.DataSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {

    public static DataSet read(String filePath) {

        DataSet dataSet = new DataSet();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String headerLine = br.readLine();

            if (headerLine == null) {
                return dataSet;
            }

            String[] headers = headerLine.split(",");
            String line;

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                Map<String, String> map = new HashMap<>();

                for (int i = 0; i < headers.length && i < values.length; i++) {
                    map.put(headers[i], values[i]);
                }

                dataSet.addRecord(new Record(map));
            }

            System.out.println("CSV file loaded successfully.");

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }

        return dataSet;
    }
}