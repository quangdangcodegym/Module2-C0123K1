package document_manager;

public class Book extends Document{
    private String author;
    private int pageNumber;

    public Book() {

    }

    public Book(long id, int releaseNumber, String author, int pageNumber) {
        super(id, releaseNumber);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public Book(String author, int pageNumber) {
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", id=" + id +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
