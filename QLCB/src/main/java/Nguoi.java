public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String quequan;
    private long maso;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String quequan, long maso) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.quequan = quequan;
        this.maso = maso;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public long getMaso() {
        return maso;
    }

    public void setMaso(long maso) {
        this.maso = maso;
    }
}
