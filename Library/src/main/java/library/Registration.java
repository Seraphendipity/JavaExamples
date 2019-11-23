package library;

public class Registration extends lElement
{
    int visitorId;
    int bookId;
    
    public Registration(int visitorId, int bookId) {
        this.visitorId = visitorId;
        this.bookId = visitorId;
    }

    /**
     * @return the visitorId
     */
    public int getVisitorId() {
        return visitorId;
    }

    /**
     * @param visitorId the visitorId to set
     */
    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * @return the bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
