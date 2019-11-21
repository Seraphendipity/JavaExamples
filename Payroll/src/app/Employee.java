package app;

public class Employee {
    private final int id;
    private static int idCounter;

    private String fName;
    private String lName;
    private String title;
    private String dept;
    private int salary;

    /**
     * @param id
     * @param fName
     * @param lName
     * @param title
     * @param dept
     * @param salary
     */
    public Employee(String fName, String lName, String title, String dept, int salary) {
        this.id = idCounter++;
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.dept = dept;
        this.salary = salary;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the idCounter
     */
    public static int getIdCounter() {
        return idCounter;
    }

    /**
     * @param idCounter the idCounter to set
     */
    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    public String toCSV() {
        return fName + "," + lName + "," + title + "," + dept + "," + salary;
    }
    
    @Override
    public String toString() {
        return "| " + id + " | " + fName + " | " + lName + " | " + title + " | " + dept + " | " + salary + " |";
    }
    
    public String toString(int i) {
        String body = "| %*d | %*s | %*s | %*s | %*s | %*d |";
        return doubleFormatter(body, i, id, fName, lName, title, dept, salary);
    }

    private static String doubleFormatter(String body, int size, String... values ) {
        return "hello";
    }
    
    
}