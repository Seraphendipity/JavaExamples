package ems;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class EMSController {
    EMSView view;

    public EMSController(EMSView view) {
        this.view = view;
    }

	/**
	 * 
	 */
	public void menuOptions(EmployeeCollection ec) {
        Boolean bInteract = true;
        while(bInteract) {
            Scanner input = new Scanner(System.in);  // Create a Scanner object
            System.out.println("What would you like to do? ");
            String iLine = input.nextLine();  // Read user input
            String[] iLineArr = iLine.split(" ");
            String cmd = iLineArr[0].toLowerCase();
            switch (cmd) {
                case "help":
                    view.showMenu(ec.getEmployees());
                    break;
                case "exit":
                    bInteract = false;
                    break;
                case "add":
                    ec.addEmployee(iLine.substring(3).trim());
                    break;
                case "rem":
                    Employee employee = null;
                    if(iLineArr.length >= 3) {
                        String name = iLineArr[1];
                        String blid = iLineArr[2];
                        if((employee = ec.remEmployee(blid, name)) == null) {
                            System.out.println("Could not find employee with name '" + name + "' and ID '" + blid + "'.");
                        } else {
                            System.out.println("Successfully remove employee " + employee);
                        }
                    } else {
                        System.out.println("Not enough input arguements to remove employee.");
                    }
                    break;
                case "save":
                    ec.save("uabEmployees-output.txt");
                    break;
                default:
                    System.out.println("Unrecognized command: "+iLine);
            }
        }
    }
}