package abstract_interface.basic;

// lớp abstract thì không thể là final: vì để cho con cháu kế thừa
// public abstract class Geometric
public abstract class Geometric {
    // trong lớp trừu tượng có thể có thuộc BÌNH THƯỜNG
    protected String color;
    protected boolean filled;

    // public final abstract float getArea();
    // phương thức trừu tượng không được phép là final vì để cho các các lớp con
    // có thể triển khai lại được
    public abstract float getArea();

    // trong lớp trừu tượng  vẫn có hàm khởi tạo BÌNH THƯỜNG
    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Geometric() {

    }

    // trong lớp trừu tượng có thể có phương thức BÌNH THƯỜNG (có phần thân)
    @Override
    public String toString() {
        return String.format("Geometric color: %s , filled: %s",
                color, filled);
    }

    public static void main(String[] args) {

        // vì sao không tạo được đối tượng Geometric            ???
        // Vì lớp lớp trừu tượng thì không thể tạo được đối tương
//        Geometric geometric = new Geometric();

        // vì sao tạo được đối tượng circle                 ???
        // Vì circle là 1 lớp cụ thể
        Circle circle = new Circle();
    }
}
