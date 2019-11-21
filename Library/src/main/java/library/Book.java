package library;

public class Book extends lElement
{
    private String title;
    private String author;
    private int pageCount;
    private String publisher;

    /**
     * @param title
     * @param author
     * @param pageCount
     * @param publisher
     * @param id
     */
    public Book(String title, String author, int pageCount, String publisher, int id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the pageCount
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
