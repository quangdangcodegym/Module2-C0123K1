package reviews;

public class Geometric{
    protected String color;     // null
    protected boolean filled;      //false


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("Geometric color: %s, filled: %s", color, filled);
    }
}
