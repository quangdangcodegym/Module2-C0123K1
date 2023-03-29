package abstract_interface.resizeable;


public abstract class Geometric implements Resizeable{

    // Trong lớp abstract có được cái chi:          ???
    protected String color;
    protected boolean filled;

    public abstract float getArea();

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Geometric() {

    }

    @Override
    public String toString() {
        return String.format("Geometric color: %s , filled: %s",
                color, filled);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
    }
}
