package oop.basic;

public class Person {
    //instance variable (biếncủađốitượng)
    private String name;        // null
    private int age;            // 0

    // Hàm khởi tạo không tham số
    public Person() {

    }
    // Hàm khoi tạo 2 tham số
    // Hàm khởi tạo thì: có tên giống tên lớp, không có giá trị trả về
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.printf("Xin chao tui là %s - tui năm nay %s", this.name, this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Cập nhật tuổi ko hợp lệ");
        }else{
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // new Person();    0x32a
        // p = 0x32a
        Person p = new Person();
        System.out.println(p.name);



        Person p1;      // p1: null
        p1 = new Person("Chau Nghia", 31);
        System.out.println(p1.name);
//        p1.age = -2;
        p1.setAge(-2);
        p1.setAge(18);

        System.out.println(p.age);
    }
}
