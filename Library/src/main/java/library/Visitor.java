package library;

public class Visitor extends lElement
{
    private String fName;
    private String lName;
    private String email;

    /**
     * @param fName
     * @param lName
     * @param email
     */
    public Visitor(String fName, String lName, String email, int id) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.id = id;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }



}
