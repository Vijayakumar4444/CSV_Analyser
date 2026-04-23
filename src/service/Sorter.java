package service;

//import model.Record;
import model.DataSet;

public class Sorter {

    public static void sort(DataSet ds, String column) {

        if (ds == null) {
            return;
        }

        ds.getRecords().sort((a, b) -> {
            try {
                double x = Double.parseDouble(a.getValue(column));
                double y = Double.parseDouble(b.getValue(column));
                return Double.compare(x, y);
            } catch (Exception e) {
                return a.getValue(column).compareTo(b.getValue(column));
            }
        });

        System.out.println("Data sorted.");
    }
}