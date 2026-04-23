package service;

import model.Record;
import model.DataSet;

public class Search {

    public static DataSet search(DataSet ds, String keyword) {

        DataSet result = new DataSet();

        if (ds == null) {
            return result;
        }

        for (Record record : ds.getRecords()) {

            for (String value : record.getAll().values()) {
                if (value.toLowerCase().contains(keyword.toLowerCase())) {
                    result.addRecord(record);
                    break;
                }
            }
        }

        return result;
    }
}