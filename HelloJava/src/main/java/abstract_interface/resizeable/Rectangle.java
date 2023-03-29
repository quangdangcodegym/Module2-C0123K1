package abstract_interface.resizeable;

public class Rectangle extends Geometric{
    private float width;
    private float height;

    public Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public float getArea() {
        return this.height*this.width;
    }

    @Override
    public void resize(float percent) {
        this.width = (float) (this.width*Math.sqrt(percent));
        this.height = (float) (this.height * Math.sqrt(percent));
    }
    @Override
    public String toString() {
        return String.format("Rectange color: %s , filled: %s, area: %s",
                color, filled, this.getArea());
    }
}
