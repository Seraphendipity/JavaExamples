package ems;

public class Employee {
    private String blid;
    private String name;

    public Employee(String blid, String name) {
        this.blid = blid;
        this.name = name;
    }

    /**
     * @return the blid
     */
    public String getBlid() {
        return blid;
    }

    /**
     * @param blid the blid to set
     */
    public void setBlid(String blid) {
        this.blid = blid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
        return roleLetter + " " + this.name + " " + this.blid;
    }


    public String toDisplay() {
        return this.toDisplay("E");
    }

    public String toDisplay(String roleLetter) {
        return "| ID: " + this.blid + " | NAME: " + this.name + " |";
    }
    
    
}