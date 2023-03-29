package oop.point;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        // Cách 1: ???
        // supper để làm gì
        super(x,y);
        this.z = z;

        // Cách 2: ???
//        this.setX(x);
//        this.setY(y);
//
//        this.z = z;

        // Cách 3:  ???
//        super.setX(x);
//        super.setY(y);
//
//        this.z = z;
    }
    public Point3D() {
        // Chỗ này có ý nghia gì: ???
//        super();
    }

    public float getZ() {
        // Chỗ này: this có ý nghĩa gì: ???
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ() {
        float[] xyz = new float[3];
        // Chỗ này là sao: ???
        // Vì sao getX() cũng được, mà this.getX() cũng được, super.getX() cũng được
        xyz[0] = getX();            //???
        xyz[1] = super.getY();      //???
        xyz[2] = this.getZ();       //???

        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public String toString() {
        return String.format("(%s, %s, %s)", this.getX(), this.getY(), this.z);
    }


}
