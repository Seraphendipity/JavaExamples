package library;

public class Registration extends lElement
{
    Visitor visitorId;
    Book bookId;
    
    public Registration(int visitorId, int bookId) {
        this.visitorId = visitorId;
        this.bookId = visitorId;
    }

    /**
     * @return the visitorId
     */
    public Visitor getVisitorId() {
        return visitorId;
    }

    /**
     * @param visitorId the visitorId to set
     */
    public void setVisitorId(Visitor visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * @return the bookId
     */
    public Book getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }
}
