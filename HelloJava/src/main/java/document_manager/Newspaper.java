package document_manager;

import java.util.Date;

public class Newspaper extends Document {
    private Date dateRelease;

    public Newspaper() {

    }
    public Newspaper(long id, int releaseNumber, Date release) {
        super(id, releaseNumber);
        this.dateRelease = release;
    }

    public Newspaper(Date release) {
        this.dateRelease = release;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dateRelease=" + dateRelease +
                ", id=" + id +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
