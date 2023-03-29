package basic;

import java.util.Scanner;

public class Buoi2 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        // ctrl + / đẻ comment
//        exercisePrime();
//        excersiseEven();


    }

    public static void excerciseMenu() {
        boolean checkActionMenu = false;
        do{
            System.out.println("Giải các bài tập: ");
            System.out.println("BT1: Kiểm tra số nguyên tố. Nhấn 1");
            System.out.println("BT2: In ra số chẵn . Nhấn 2");
            System.out.println("BT3: Tính tổng. Nhấn 3");

            int actionMenu = scanner.nextInt();
            switch (actionMenu) {
                case 1:
                    exercisePrime();
                    break;
                case 2:
                    excerciseEven();
                    break;
                case 3:
                    excerciseTotal();
                    break;
            }
            checkActionMenu = true;
        }while (checkActionMenu);
    }
    public static void excerciseTotal() {
        System.out.println("Nhập vào 1 con số, tính tổng các số chẵn từ 1 đến số đó: ");
        int number = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                // total = total + i
                total += i;
            }
        }
        // để xuống dòng thì thêm kí tu: \n
        System.out.printf("Tổng các giá trị từ 1 đến %s là %s\n", number, total);
    }
    public static void excerciseEven() {
        System.out.println("Nhập vào 1 con số, in ra các số chẵn từ 1 tới số đó: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            // Ctrl + Shift + Enter:  dùng để format lại câu lệnh
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // return mà không trả về giá trị thì trả về kiểu void
//        return;

    }
    public static void exercisePrime() {
        System.out.println("Nhập vào một số: ");
        int number = scanner.nextInt();
        boolean check = isPrime(number);
        if (check == true) {
            System.out.println(number + " là số nguyên tó");
        }else{
            System.out.printf("%s không là số nguyên tố", number);
        }
    }

    //
    public static boolean isPrime(int number){
        boolean check = true;
        if (number <= 1) {
            System.out.printf("%s không là số nguyên tố", number);
        }
        for(int i=2;i<number-1;i++){
            if (number % 2  == 0) {
                check = false;
            }
        }
        return check;
    }
}
