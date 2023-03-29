package oop.point;

import java.util.Arrays;

public class Point2D {
    // Biến x này là gì:    ???
    private float x;          // 0.0f
    private float y;

    // Hàm khoi tạo để làm gì: ???
    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // Getter, setter để làm gì: ???
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    // phương thức toString() từ đâu ra và nó để làm gì         ???
    // Tại sao phải ghi đè phương thức nay                      ???
    @Override
    public String toString() {
        // (2,3)
        return String.format("(%s,%s)", this.x, this.y);
    }



}
