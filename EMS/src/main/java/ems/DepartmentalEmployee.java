package ems;

public class DepartmentalEmployee extends Employee {
    private String department;

    public DepartmentalEmployee(String blid, String name) {
        super(blid, name);
    }

    public DepartmentalEmployee(String blid, String name, String department) {
        super(blid, name);
        this.department = department;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return this.toString("E");
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString(String roleLetter) {
        return super.toString(roleLetter) + " " + this.department;
    }


    public String toDisplay() {
        return this.toDisplay("E");
    }

    public String toDisplay(String roleLetter) {
        return super.toDisplay(roleLetter) + " DEPT: " + this.department + " |";
    }

}