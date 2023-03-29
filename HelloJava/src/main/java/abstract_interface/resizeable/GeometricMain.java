package abstract_interface.resizeable;

import java.util.Arrays;
import java.util.Comparator;

public class GeometricMain {
    public static void main(String[] args) {

        Geometric[] geometrics = new Geometric[5];
        geometrics[0] = new Circle(6);
        geometrics[1] = new Rectangle(6, 4);
        geometrics[2] = new Rectangle(5, 5);
        geometrics[3] = new Circle(6.5f);
        geometrics[4] = new Rectangle(5, 6);

        Comparator comparator = new ComparatorGeometricByArea();
        Arrays.sort(geometrics, comparator);
        printArray(geometrics);
    }
    public void basic() {
        Geometric geometric = new Rectangle(4, 5);

        System.out.println("Diện tích: " + geometric.getArea());
        geometric.resize(0.5f);

        System.out.println("Diện tích sau khi resize: " + geometric.getArea());
    }

    public static void printArray(Geometric[] geometrics) {
        for (int i = 0; i < geometrics.length; i++) {
            System.out.println(geometrics[i]);
        }
    }

    public void basic1() {
        Geometric[] geometrics = new Geometric[5];
        geometrics[0] = new Rectangle(4, 5);
        geometrics[1] = new Rectangle(6, 4);
        geometrics[2] = new Rectangle(5, 5);
        geometrics[3] = new Rectangle(6, 5);
        geometrics[4] = new Rectangle(5, 6);


        Comparator comparator = new ComparatorRectangeByArea();
        Arrays.sort(geometrics, comparator);

        printArray(geometrics);
    }

}
