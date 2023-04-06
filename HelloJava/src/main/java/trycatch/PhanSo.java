package trycatch;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tu, int mau) throws PhanSoException {
        if (mau == 0) {
            throw new PhanSoException("Phân số thì mẫu không the = 0");
        }
    }

    public static void main(String[] args) throws PhanSoException{
        /**
        try {

            PhanSo a = new PhanSo(10, 5);
        } catch (PhanSoException phanSoException) {
            System.out.println(phanSoException.getMessage());
        }
         **/

        PhanSo a = new PhanSo(10, 5);    // throw new PhanSoException("Phân số thì mẫu không the = 0");

    }
}
