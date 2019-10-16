package student;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class StudentTester 
{
    public static void main( String[] args )
    {
        try  {
            File iFile = new File("./resources/input.csv");
            Scanner fileScanner = new Scanner(iFile);
            File oFile = new File("./resources/output.txt");
            PrintWriter pw = new PrintWriter(oFile);

            ArrayList<Student> students = new ArrayList<Student>();
            String fName, lName;
            ArrayList<Integer> scores = new ArrayList<>();
            String s;
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                
                if(lineScanner.hasNext()) {
                    fName = lineScanner.next();
                    lName = lineScanner.next();
                    while(lineScanner.hasNextInt()) {
                        // System.out.println(lineScanner.nextInt());
                        scores.add(lineScanner.nextInt());
                    }
                    students.add(new Student(fName, lName, scores));
                    scores.clear();
                }
                lineScanner.close();
            
            }

            for(Student student : students) {
                s = student.toString();
                pw.println(s);
                System.out.println(s);;
            }

            fileScanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find iFile.");
            e.printStackTrace();
        }
    }
}
