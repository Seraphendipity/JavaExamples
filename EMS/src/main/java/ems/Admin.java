package ems;

public class Admin extends DepartmentalEmployee {

    public Admin(String blid, String name, String department) {
        super(blid, name, department);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("A");
    }
    @Override
    public String toDisplay() {
        return super.toDisplay("A");
    }

}