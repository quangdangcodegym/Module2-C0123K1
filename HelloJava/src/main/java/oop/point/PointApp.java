package oop.point;

public class PointApp {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        Point3D point3D = new Point3D(1, 5, 1);

        System.out.println("Tọa độ của point2D");

        // Vì sao bỏ vào point2D không cần chấm toString()      //???
//        System.out.println(point2D.toString());
        System.out.println(point2D);

        System.out.println("Tọa độ của:  point3D");
        System.out.println(point3D.toString());
    }
}
