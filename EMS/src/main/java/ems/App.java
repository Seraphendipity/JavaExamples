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
        EMSController controller = new EMSController(view); // Promote a MCV separation
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
            controller.menuOptions(ec);


		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
        } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    }

}
