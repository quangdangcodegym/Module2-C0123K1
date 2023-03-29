package basic;

import java.util.Arrays;

public class Buoi4 {

    public static void main(String[] args) {
//        int[] a = {1, 7, 5, 4, 2};
//        excerciseAddElementAtIndex(a, 2, 10);


        int[] a = {1, 7, 5, 4, 2};
        int [] b = excerciseRemoveElementAtIndex(a, 2);
        System.out.println(Arrays.toString(b));


        // kiểu dữ liệu Wrapper là gì

        int number = 5;
        Integer number1 = 5;

        String str = "5";
    }

    public static int [] excerciseRemoveElementAtIndex(int[] a, int index) {
        int[] aNew = new int[a.length - 1];
        for (int i = 0; i < index; i++){
            aNew[i] = a[i];
        }
        for (int j = index + 1; j < a.length; j++) {
            aNew[j-1] = a[j];
        }
        return aNew;
    }

    public static void excerciseAddElementAtIndex(int [] a, int index, int value) {

        int[] b = Arrays.copyOf(a, a.length+1);

        b[index] = value;
        for (int i = index+1; i < b.length; i++) {
            b[i] = a[i-1];
        }
        System.out.println(Arrays.toString(b));;
    }

    public static void excerciseAddElement() {
        int[] a = {1, 7, 5};

        int [] b = addElement(a, 10);
        a = b;


        System.out.println(Arrays.toString(a));

    }
    public static int [] addElement(int [] a, int value) {

        /**
        int[] aNew = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            aNew[i] = a[i];
        }
        **/

        int[] aNew = Arrays.copyOf(a, a.length + 1);

        aNew[aNew.length-1] = value;
        return aNew;
    }
    public static int [] addElement1(int [] a, int value) {

        int[] aNew = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            aNew[i] = a[i];
        }


        aNew[aNew.length-1] = value;
        return aNew;
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
