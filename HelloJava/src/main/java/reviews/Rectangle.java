package reviews;

public class Rectangle extends Geometric{
    // access modifier - kieu du lieu - ten bien(thuộc tính)
    private float width;        // 0.0f
    private float height;

    public Rectangle() {

    }

    public Rectangle(float w, float h) {
        this.width =w;
        this.height = h;

    }
    public float getArea() {
        return this.height*this.width;
    }


    public static void main(String[] args) {
        /**
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.getArea();
         **/

        Geometric geometric = new Geometric();

        System.out.println(geometric.toString());
    }
}
