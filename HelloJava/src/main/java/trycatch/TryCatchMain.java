package trycatch;

import javafx.scene.transform.Scale;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int a = Integer.parseInt(scanner.nextLine());

//        int a =10;
//            int b = a / 0;

//
//
//        int[] c = {3, 1, 5, 7};
//
//        System.out.println(c[10]);

//        PrintWriter printWriter = new PrintWriter("data.txt");

//        try {
//            PrintWriter printWriter = new PrintWriter("data.txt");
//
//        } catch (FileNotFoundException fileNotFoundException) {
//
//        }

        // checked


        testTryCatch();

//        testThrow();
    }

    public static int testTryCatch() {
        try {

            int b = scanner.nextInt();

            int a = 10;
            int c = a / 0;

            return 6;
        }catch (ArithmeticException arithmeticException) {
            System.out.println("ArithmeticException..........");
        } catch (Exception e) {
            System.out.println("Exception............");
        }finally {
            System.out.println("Finally...............");
        }

        System.out.println("AAAAAAAAAAAAA");
        return -1;
    }


    public static int testThrow() throws FileNotFoundException  {
        PrintWriter printWriter = new PrintWriter("data.txt");      // throw FileNotFoundException()
        return -1;
    }
}
