package ems;

public class Janitor extends TaskedDepartmentalEmployee {

    public Janitor(String blid, String name, String department, Boolean bTasked) {
        super(blid, name,department,bTasked);
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("J");
    }

    @Override
    public String toDisplay() {
        return super.toDisplay("J");
    }

}