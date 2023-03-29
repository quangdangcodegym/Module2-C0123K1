package abstract_interface.resizeable;

public class Circle extends Geometric {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    // Chỗ này là sao               ???
    @Override
    public float getArea() {
        return (float) (Math.PI*this.radius*this.radius);
    }

    @Override
    public void resize(float percent) {
        this.radius = this.radius * percent;
    }

    @Override
    public String toString() {
        return String.format("Cirlce color: %s , filled: %s, area: %s",
                color, filled, this.getArea());
    }
}
