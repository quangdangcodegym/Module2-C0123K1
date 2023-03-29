package document_manager;

public class Document {
    protected long id;
    protected int releaseNumber;

    public Document(long id, int releaseNumber) {
        this.id = id;
        this.releaseNumber = releaseNumber;
    }

    public Document() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
