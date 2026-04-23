package service;

import model.Record;
import model.DataSet;

public class Filter {

    public static DataSet filterByValue(DataSet ds, String column, String value) {

        DataSet result = new DataSet();

        if (ds == null) {
            return result;
        }

        for (Record record : ds.getRecords()) {
            if (record.getValue(column).equalsIgnoreCase(value)) {
                result.addRecord(record);
            }
        }

        return result;
    }
}