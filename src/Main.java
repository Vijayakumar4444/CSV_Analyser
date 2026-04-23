import model.DataSet;
import service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataSet ds = null;

        while (true) {

            System.out.println();
            System.out.println("1 Load CSV");
            System.out.println("2 Display");
            System.out.println("3 Statistics");
            System.out.println("4 Filter");
            System.out.println("5 Sort");
            System.out.println("6 Search");
            System.out.println("7 Frequency");
            System.out.println("8 Export");
            System.out.println("9 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter file path: ");
                    sc.nextLine();
                    String path = sc.nextLine();
                    ds = CSVReader.read(path);
                    break;

                case 2:
                    if (ds != null) {
                        ds.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter column: ");
                    String col = sc.next();
                    Analyzer.showStatistics(ds, col);
                    break;

                case 4:
                    System.out.print("Enter column: ");
                    String fcol = sc.next();
                    System.out.print("Enter value: ");
                    String val = sc.next();
                    DataSet filtered = Filter.filterByValue(ds, fcol, val);
                    filtered.display();
                    break;

                case 5:
                    System.out.print("Enter column: ");
                    String scol = sc.next();
                    Sorter.sort(ds, scol);
                    break;

                case 6:
                    System.out.print("Enter keyword: ");
                    String key = sc.next();
                    DataSet result = Search.search(ds, key);
                    result.display();
                    break;

                case 7:
                    System.out.print("Enter column: ");
                    String c = sc.next();
                    Analyzer.frequency(ds, c);
                    break;

                case 8:
                    System.out.print("Enter export path: ");
                    String p = sc.next();
                    Exporter.exportCSV(ds, p);
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
        
    }
}