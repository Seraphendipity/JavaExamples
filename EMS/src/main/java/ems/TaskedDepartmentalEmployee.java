package ems;

public class TaskedDepartmentalEmployee extends DepartmentalEmployee {
    private Boolean bTasked;

    public TaskedDepartmentalEmployee(String blid, String name, String department, Boolean bTasked) {
        super(blid, name, department);
        this.bTasked = bTasked;
    }

    /**
     * @return the bTasked
     */
    public Boolean getTaskStatus() {
        return bTasked;
    }

    /**
     * @param bTasked the bTasked to set
     */
    public void setTaskStatus(Boolean bTasked) {
        this.bTasked = bTasked;
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
        return super.toString(roleLetter) + " " + this.bTasked;
    }
    
    public String toDisplay() {
        return this.toDisplay("E");
    }

    public String toDisplay(String roleLetter) {
        return super.toDisplay(roleLetter) + " TASKED: " + this.bTasked + " |";
    }

}