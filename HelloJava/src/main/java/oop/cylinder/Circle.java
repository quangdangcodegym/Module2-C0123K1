package oop.cylinder;

public class Circle {
    protected float radius;
    protected String color;

    public Circle() {

    }

    public Circle(float radius) {
        this.radius = radius;
        this.color = "BLACK";
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return this.radius;
    }
    // Getter/setter ở đây để làm gì:                   ???
    public void setRadius(float radius) {
        if (radius < 0) {
            System.out.println("Bán kính không hợp lệ");
        }else{
            this.radius = radius;
        }
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return (float) (this.radius*this.radius*Math.PI);
    }

    // Hàm toString để làm gì, từ đâu ra, override là gì        ???
    // this.radius lấy thông tin radius được, không cần this. có được ko ???
    @Override
    public String toString() {
//        return "Cirlce: " + this.radius + " Color: " + this.color + " Area: " + this.getArea();
        return String.format("Circle: %s, color: %s, Area: %s",
               this.radius, color, this.getArea() );
    }
}
