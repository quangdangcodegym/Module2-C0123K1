public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){
        this.mauSo = 1;
    }

    PhanSo congPhanSo(PhanSo b) {
        int mauSoChung = PsMath.lcm(this.getMauSo(), b.getMauSo());

        int tuso = mauSoChung / this.getMauSo() * this.getTuSo() + mauSoChung / b.getMauSo() * b.getTuSo();
        PhanSo result = new PhanSo(tuso, mauSoChung);

        return result;
    }
    public PhanSo(int a, int b) {
        this.tuSo = a;
        this.mauSo = b;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
