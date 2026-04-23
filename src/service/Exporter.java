package service;

import model.Record;
import model.DataSet;

import java.io.File;
import java.io.PrintWriter;

public class Exporter {

    public static void exportCSV(DataSet ds, String path) {

        if (ds == null || ds.getRecords().isEmpty()) {
            return;
        }

        try (PrintWriter pw = new PrintWriter(new File(path))) {

            for (String key : ds.getRecords().get(0).getKeys()) {
                pw.print(key + ",");
            }
            pw.println();

            for (Record record : ds.getRecords()) {
                for (String key : record.getKeys()) {
                    pw.print(record.getValue(key) + ",");
                }
                pw.println();
            }

            System.out.println("Export completed.");

        } catch (Exception e) {
            System.out.println("Error exporting file.");
        }
    }
}