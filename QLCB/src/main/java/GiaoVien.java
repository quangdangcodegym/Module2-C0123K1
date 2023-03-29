public class GiaoVien extends Nguoi{


    private double luongcung;
    private double luongthuong;
    private double tienphat;
    private double thucnhan;

    public GiaoVien(double luongcung, double luongthuong, double tienphat, double thucnhan) {
        this.luongcung = luongcung;
        this.luongthuong = luongthuong;
        this.tienphat = tienphat;
        this.thucnhan = thucnhan;
    }

    public GiaoVien(String hoTen, int tuoi, String quequan, long maso,
                    double luongcung, double luongthuong, double tienphat, double thucnhan) {
        super(hoTen, tuoi, quequan, maso);
        this.luongcung = luongcung;
        this.luongthuong = luongthuong;
        this.tienphat = tienphat;
        this.thucnhan = thucnhan;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(double luongthuong) {
        this.luongthuong = luongthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getThucnhan() {
        return thucnhan;
    }

    public void setThucnhan(double thucnhan) {
        this.thucnhan = thucnhan;
    }
}
