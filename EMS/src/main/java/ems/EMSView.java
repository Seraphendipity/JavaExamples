package ems;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class EMSView {
    private String viewType;
    private static String[] viewTypes = {"cmd","gui"};

    public EMSView(String viewType) {
        if(Arrays.asList(viewTypes).contains(viewType)) {
            this.viewType = viewType;
        } else {
            this.viewType = viewTypes[0];
        }
    }

	/**
	 * @return the viewType
	 */
	public String getViewType() {
		return viewType;
    }
    
    public void showMenu(HashMap<String,ArrayList<Employee>> employees) {
        HashMap<Integer,String> s = new HashMap<>();
        int i = 0; // StringCount
        int j = 0; // RoleCount
        int k = 0; // EmployeeCount
        int headerNum = 0; // RoleCount
        int roleHeaderNum = 0; // RoleCount
        // VIEW
        
        System.out.println("================================================================================");
        System.out.println("                      UAB Health Employee Management System                     ");
        System.out.println("________________________________________________________________________________");
        System.out.println();
        s.put(headerNum = i++,"EMPLOYEES - ");
        
        // https://stackoverflow.com/questions/4234985/how-to-for-each-the-hashmap
        for(Map.Entry<String, ArrayList<Employee>> entry : employees.entrySet()) {
            String key = entry.getKey();
            ArrayList<Employee> job = entry.getValue();
            s.put(roleHeaderNum = i++,System.lineSeparator()+"  "+key.toUpperCase()+" - ");
            for(Employee employee : job) {
                j++; 
                s.put(i++,"    " + employee.toDisplay());
            }
            k += j;
            s.put(roleHeaderNum,s.get(roleHeaderNum)+j);
            j = 0;
        }
        s.put(headerNum,s.get(headerNum)+k);


       for(Map.Entry<Integer,String> entry : s.entrySet()) {
           System.out.println(entry.getValue());
       }
        
        System.out.println("________________________________________________________________________________");
        System.out.println("DIRECTIONS");
        System.out.println("  Add/Remove employees. Format is '[KEYWORD] [PARAM1] [PARAM2] '...");
        System.out.println("  Separate parameters by spaces. Additional parameters will be ignored;");
        System.out.println("  lacking parameters will cause the entire entry to be ignored.");
        System.out.println("  Deleting data is permanent currently, so be careful.");
        System.out.println("  ID's do not have to be unqie, but name-ID pairs do.");
        System.out.println();
        System.out.println("  Type 'EXIT' to end it, where saves will be changed back to the file.");
        System.out.println("                    ----------------------------------------                    ");
        System.out.println("OPTIONS");
        System.out.println("  ADD - Add an Employee");
        System.out.println("    ROLE - Role of Employee to Add");
        System.out.println("      D - Doctor");
        System.out.println("      S - Surgeon");
        System.out.println("      N - Nurse");
        System.out.println("      R - Receptionist");
        System.out.println("      J - Janitor");
        System.out.println("      A - Admin");
        System.out.println("      E - Standard Employee");
        System.out.println("    NAME - Name of Employee to Add");
        System.out.println("    BLID - ID of Employee to Add; must be Integer");
        System.out.println("    OPT1 - Optional Parameter for Some Roles");
        System.out.println("      D - Department");
        System.out.println("      S - Department");
        System.out.println("      N - Number of Patients");
        System.out.println("      R - Department");
        System.out.println("      J - Department");
        System.out.println("      A - Department");
        System.out.println("      E - N/A");
        System.out.println("    OPT2 - Optional Parameter for Some Roles");
        System.out.println("      D - N/A");
        System.out.println("      S - Are they Occupied with Task? Y/N");
        System.out.println("      N - N/A");
        System.out.println("      R - Are they Occupied with Task? Y/N");
        System.out.println("      J - Are they Occupied with Task? Y/N");
        System.out.println("      A - N/A");
        System.out.println("      E - N/A");
        System.out.println("  REM - Remove an Employee");
        System.out.println("    NAME - Name of Employee to Remove");
        System.out.println("    BLID - ID of Employee to Remove");
        System.out.println("  MENU - Re-print this Menu");
        System.out.println("  EXIT - Exit the Program");
        System.out.println("                    ----------------------------------------                    ");
        System.out.println("EXAMPLES");
        System.out.println("  ADD R Stacy 9257 Communications Y");
        System.out.println("  REM Stacy 9257");
        System.out.println("________________________________________________________________________________");
        System.out.println("                        Elijah T. Rose | elirose@uab.edu                        ");
        System.out.println("================================================================================");

    }

    

}