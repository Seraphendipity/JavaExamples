package ems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public  class App {
    //try {
    public static void main(String args[]) {
        EMSView view = new EMSView("cmd"); // Promote a MCV separation
        String line = null;
        String dbName = "uabEmployee.txt";
        String dbPath = "./resources/";  
        FileReader iFile;
        String[] roles = {"standard employees", "doctors", "surgeons", "admins", "receptionists", "janitors", "nurses"};   
        EmployeeCollection ec = new EmployeeCollection(roles);
		try {
			iFile = new FileReader(dbPath+dbName);

   
            BufferedReader reader = new BufferedReader(iFile);
            while((line = reader.readLine()) != null) {
                ec.addEmployee(line);
            }
            reader.close();

            view.showMenu(ec.getEmployees());

            Boolean bInteract = true;
            while(bInteract) {
                Scanner input = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What would you like to do? ");
                String iLine = input.nextLine();  // Read user input

                String cmd = iLine.split(" ")[0].toLowerCase();
                switch (cmd) {
                    case "help":
                        view.showMenu(ec.getEmployees());
                        break;
                    case "exit":
                        bInteract = false;
                        break;
                    case "add":
                        ec.addEmployee(iLine);
                        break;
                    case "rem":
                        ///removeEmployee(iLine);
                        break;
                    default:
                        System.out.println("Unrecognized command: "+iLine);
                }
        }

		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
        } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    }

}
