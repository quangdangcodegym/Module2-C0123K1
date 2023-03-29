package oop.basic;

public class Rectangle {

    public double width;    // 0.0d
    public double height;   // 0.0d


    public void showInfo() {
        System.out.printf("Rectangle width: %d, height: %d", this.width, this.height);
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {

    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
}
