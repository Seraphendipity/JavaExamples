package ems;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class EmployeeCollection {
    private HashMap<String,ArrayList<Employee>> employees;

    public EmployeeCollection(String[] roles) {
        this.employees = new HashMap<>();  
        for(String role : roles) {
            employees.put( role, new ArrayList<>() );       
        }   
        }

    
    /**
     * @return the employees
     */
    public HashMap<String, ArrayList<Employee>> getEmployees() {
        return employees;
    }
    
    /**
     * @param employees the employees to set
     */
    public void setEmployees(HashMap<String, ArrayList<Employee>> employees) {
        this.employees = employees;
    }
    
        
    public void addEmployee(String line) {
        String role = "E";
        String name = "NAME"; 
        String blid = "0000";
        String opt1 = "DEPT";
        Boolean opt2 = false;
      
        String[] lineData = line.split(" ");

            if(lineData.length >= 3) {
                // Unnecessary, but clearer
                // Alt: use lineData arg as input (like PHP arrayAsArg)
                role = lineData[0];
                name = lineData[1];
                blid = lineData[2];
                if(lineData.length >= 4) {
                    opt1 = lineData[3];
                    if(lineData.length >= 5) {
                        opt2 = (lineData[4] == "Y"?true:false);
                    }
                }
            } else {
                // Not enough variables, skip
            }
            switch (role) {
                case "E":
                    employees.get("standard employees").add(new Employee(blid,name));
                    break;
                case "D":
                    employees.get("doctors").add(new Doctor(blid,name,opt1));
                    break;
                case "S":
                    employees.get("surgeons").add(new Surgeon(blid,name,opt1,opt2));
                    break;
                case "A":
                    employees.get("admins").add(new Admin(blid,name,opt1));
                    break;
                case "R":
                    employees.get("receptionists").add(new Receptionist(blid,name,opt1,opt2));
                    break;
                case "J":
                    employees.get("janitors").add(new Janitor(blid,name,opt1,opt2));
                    break;
                case "N":
                    employees.get("nurses").add(new Nurse(blid,name,opt1));
                    break;
                default:
                    // Unrecognized Role, skip
            }
            
        }
    }