package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String iFilepath = "./src/resources/";
        String iFilename = "company_records.csv";
        File iFile = new File(iFilepath+iFilename);
        try {
            Employees eList = readCSV(iFile);
            for(Employee e : eList) {
                System.out.println(e.toString());
            }
            System.out.println("BUDGET: " + eList.getBudget());
            System.out.println("BUDGET: " + eList.getBudget("ADMIN"));
            System.out.println("DEPT WITH MAX BUDGET:" + eList.getDeptWithHighestBudget());
            System.out.println("NO OF UNIQUE SALARIES:" + eList.getUniqueSalariesCount());
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file \"" + iFilename + "\" in \"" + iFile.getAbsolutePath() + "\".");
        } catch (IOException e) {
            System.out.println("IO Problem.");

        }
    }

    // https://javarevisited.blogspot.com/2015/06/2-ways-to-parse-csv-files-in-java-example.html
     /*
     * Java program to read CVS file using BufferedReader and String split()
     * method
     */
    public static Employees readCSV(File iFile) throws FileNotFoundException, IOException {
        Employees list = new Employees();
        BufferedReader br = new BufferedReader(new FileReader(iFile));

        String line = br.readLine(); // Reading header, Ignoring

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] fields = line.split(",");
            list.add(new Employee(fields[0],fields[1],fields[2],fields[3],Integer.parseInt(fields[4])));
        }
        br.close();
        return list;
    }

    /*
     * Method to read CSV file using CSVParser from Apache Commons CSV
     */
    // public static void parseCSV() throws FileNotFoundException, IOException {
    //     CSVParser parser = new CSVParser(new FileReader("countries.csv"), CSVFormat.DEFAULT.withHeader());

    //     for (CSVRecord record : parser) {
    //         System.out.printf("%s\t%s\t%s\n", record.get("NAME"),
    //                 record.get("CAPITAL"), record.get("CURRENCY"));
    //     }
    //     parser.close();
    // }

}