package ems;

public class Nurse extends Employee {
    private String patientCount;

    public Nurse(String blid, String name) {
        super(blid, name);
    }

    public Nurse(String blid, String name, String patientCount) {
        super(blid, name);
        this.patientCount = patientCount;
    }

    /**
     * @return the patientCount
     */
    public String getpatientCount() {
        return patientCount;
    }

    /**
     * @param patientCount the patientCount to set
     */
    public void setpatientCount(String patientCount) {
        this.patientCount = patientCount;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString("N") + " " + this.patientCount;
    }

    @Override
    public String toDisplay() {
        return super.toDisplay("N") + " " + this.patientCount;
    }

}