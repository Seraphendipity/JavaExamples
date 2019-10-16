package ems;

public class Surgeon extends TaskedDepartmentalEmployee {

    public Surgeon(String blid, String name, String department, Boolean bTasked) {
        super(blid, name,department,bTasked);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("S");
    }
    @Override
    public String toDisplay() {
        return super.toDisplay("S");
    }

}