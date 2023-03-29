package basic;

public class Buoi3 {
    public static void main(String[] args) {
        /**
        // Cách 1: khởi tạo 1 mảng numbers kiếu int với 5 phần tử
        // Cách 2: Tạo ra một biến number kiếu mảng int, tham chiếu tới đối tượng mảng gồm 5 phần
        //        int [] numbers = new int[5];

        // Khởi tạo nhanh 1 mảng gồm 5 phần từ



        // Truy cập các giá trị của mang
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

         // Tìm giá trị lớn nhất của mảng
         int max = findMaxInArray(numbers);
         System.out.printf("Cách 1: Giá trị lớn nhất của mảng là %s \n", max);
         System.out.printf("Cách 2: Giá trị lớn nhất của mảng là %s \n", findMaxInArray(numbers));
         int [] a = new int[5];
         int[] b = {1, 7, 5, 1, 7};

         printArray(a);
         mergeArray2(a, b);
         printArray(a);
         **/

        // BT4: Thêm phần tử vào mảng




    }



    // Không áp dụng tham chiêu
    public static void mergeArray2(int[] x, int[] y) {
        int[] totals = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            totals[i] = x[i];
        }
        for (int j = 0; j < y.length; j++) {
            totals[x.length + j] = y[j];
        }
        x = totals;
    }
    public static int[] mergeArray(int[] a, int[] b) {

        int[] totals = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            totals[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            totals[a.length + j] = b[j];
        }
        return totals;
    }

    public static int [] copyArray(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
    public static int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void checkSymmetryArray(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Mảng đối xưng");
        }else{
            System.out.println("Mảng không đối xứng");
        }
    }
    public static void reverseArray(int [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
