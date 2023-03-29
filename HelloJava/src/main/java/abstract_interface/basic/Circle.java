package abstract_interface.basic;

public class Circle extends Geometric{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    // 1 lớp con kế thừa lớp abstract thì phải triển khai các phương thức trừu tượng của lớp cha
    @Override
    public float getArea() {
        return (float) (Math.PI*this.radius*this.radius);
    }
}
