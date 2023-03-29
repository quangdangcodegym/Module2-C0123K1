public class PSMain {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(1, 2);
        PhanSo ps3 = new PhanSo(1, 2);

        PhanSo result1 = congPhanSo(ps1, ps2);


        PhanSo result11 = congPhanSo(result1, ps3);
        System.out.printf("Phân số: %s/%s\n", result11.getTuSo(), result11.getMauSo());

        PhanSo result2 = ps1.congPhanSo(ps2).congPhanSo(ps3);
        System.out.printf("Phân số: %s/%s\n", result2.getTuSo(), result2.getMauSo());

    }

    public static PhanSo congPhanSo(PhanSo a, PhanSo b) {
        int mauSoChung = PsMath.lcm(a.getMauSo(), b.getMauSo());

        int tuso = mauSoChung / a.getMauSo() * a.getTuSo() + mauSoChung / b.getMauSo() * b.getTuSo();
        PhanSo result = new PhanSo(tuso, mauSoChung);

        return result;
    }



}
