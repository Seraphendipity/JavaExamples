package ems;

public class Doctor extends DepartmentalEmployee {

    public Doctor(String blid, String name, String department) {
        super(blid, name, department);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("D");
    }
    @Override
    public String toDisplay() {
        return super.toDisplay("D");
    }

}