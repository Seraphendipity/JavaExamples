package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employees extends ArrayList<Employee> {
    private static final long serialVersionUID = -2457427865935472544L;

    public Employees() {
        super();
    }
    
    /**
     * @return the salary
     */
    public int getBudget() {
        int budget = 0;
        for(Employee e : this) {
            budget += e.getSalary();
        }
        return budget;
    }

    /**
     * @param dept a given department
     * @return the salary of a given department
     */
    public int getBudget(String dept) {
        int budget = 0;
        for(Employee e : this) {
            if(e.getDept().compareToIgnoreCase(dept) == 0) {
                budget += e.getSalary();
            }
        }
        return budget;
    }

    /**
     * @return the name of the department with the highest budget
     */
    public String getDeptWithHighestBudget() {
        int max = 0;
        ArrayList<String> depts = removeDuplicates(this.getColumn(EmployeeField.dept));
        String maxElem = depts.get(0);
        for(String d : depts) {
            if( this.getBudget(d) >= max) {
                max = this.getBudget(d);
                maxElem = d;
            }
        }
        return maxElem;
    }



    /**
     * Yeah it's weird but this is what the project wants for whatever reason.
     * @return the salary of a given department
     */
    public int getUniqueSalariesCount() {
        //https://stackoverflow.com/questions/12719998/how-to-count-unique-values-in-an-arraylist
        ArrayList<Integer> sList = new ArrayList<>();
        for(Employee e : this) {
            sList.add(e.getSalary());
        }
        return (int)sList.stream().distinct().count();
    }

    public <T> ArrayList<T> getColumn(EmployeeField header) {
        ArrayList<T> column = new ArrayList<>();
        for(Employee e : this) {

            switch(header) {
                case fName:
                    column.add((T)e.getfName());
                    break;
                case lName:
                    column.add((T)e.getlName());
                    break;
                case title:
                    column.add((T)e.getTitle());
                    break;
                case dept:
                    column.add((T)e.getDept());
                    break;
                case salary:
                    //column.add((T)e.getSalary());
                    break;
            }
        }
        return column;
    }

    // https://www.geeksforgeeks.org/how-to-remove-duplicates-from-arraylist-in-java/
    private static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 

    enum EmployeeField {
        fName,lName,title,dept,salary;
    }


}