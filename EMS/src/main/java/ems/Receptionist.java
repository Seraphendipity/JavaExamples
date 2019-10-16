package ems;

public class Receptionist extends TaskedDepartmentalEmployee {

    public Receptionist(String blid, String name, String department, Boolean bTasked) {
        super(blid, name,department,bTasked);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("R");
    }
    @Override
    public String toDisplay() {
        return super.toDisplay("R");
    }

}