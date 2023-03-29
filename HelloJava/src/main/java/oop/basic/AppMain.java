package oop.basic;

public class AppMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        System.out.println(r1.getArea());

//        System.out.printf("Rectangle width: %d, height: %d", r1.width, r1.height);
        r1.showInfo();

        Rectangle r2 = new Rectangle();
        System.out.println(r2.getArea());

//        System.out.printf("Rectangle width: %d, height: %d", r2.width, r2.height);
        r2.showInfo();



    }
}
