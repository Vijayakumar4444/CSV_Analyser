# CSV_Analyser
A Java-based CSV Data Analyzer built using object-oriented programming principles. The project supports reading CSV files, performing statistical analysis, filtering, sorting, searching, frequency analysis, and exporting processed data.


## Overview

CSV_Analyser is a console-based Java application that processes and analyzes CSV files. The project is designed using object-oriented programming concepts such as encapsulation, modularity, and separation of concerns.

It allows users to load CSV data and perform operations like filtering, sorting, searching, statistical analysis, and exporting results.


## Features

- Load and read CSV files
- Display tabular data
- Compute statistics (minimum, maximum, average)
- Filter data by column values
- Sort data (supports numeric and string sorting)
- Search records using keywords
- Frequency analysis for any column
- Export processed data to a new CSV file


## Project Structure

```text
CSV_Analyser/
├── src/
│   ├── Main.java
│   ├── model/
│   │   ├── Record.java
│   │   └── DataSet.java
│   └── service/
│       ├── CSVReader.java
│       ├── Analyzer.java
│       ├── Filter.java
│       ├── Sorter.java
│       ├── Search.java
│       └── Exporter.java
└── data.csv
```


## How to Run

1. Open terminal in project root directory

2. Compile the project    javac -d . src\model*.java src\service*.java src\Main.java

3. Run the program    java Main

4. Enter CSV file path when prompted    data.csv


## Key Concepts Demonstrated

- Encapsulation using Record class
- Data abstraction through DataSet
- Separation of logic using service classes
- Reusability and modular design
- Exception handling
- File input and output operations


