package trycatch;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(int x, int y, int z) throws TriangleException {
        boolean isNegativeSide = x < 0 || y < 0 || z < 0;
        boolean is2TotalSideGreaterthan1Side = ((x+y) < z) || ((x+z)<y) || ((y+z) < x);
        if (isNegativeSide || is2TotalSideGreaterthan1Side){
            throw new TriangleException("Tam giác không hợp lệ");
        }
    }

    public static void main(String[] args) throws TriangleException{

        try {
            Triangle triangle = new Triangle(3, 4, 8);
        } catch (TriangleException triangleException) {
            throw new TriangleException("Tui đã xử lý 1 phần, tui ném lên anh tiếp đây");
        }

    }
}
