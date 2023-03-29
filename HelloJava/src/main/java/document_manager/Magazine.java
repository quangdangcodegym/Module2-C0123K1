package document_manager;

public class Magazine extends Document{
    private int numberRelease;
    private int monthRelease;

    public Magazine(int numberRelease, int monthRelease) {
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    public Magazine(long id, int releaseNumber, int numberRelease, int monthRelease) {
        super(id, releaseNumber);
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "numberRelease=" + numberRelease +
                ", monthRelease=" + monthRelease +
                ", id=" + id +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
