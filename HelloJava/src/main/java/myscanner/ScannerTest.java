package myscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        scannerFromFile();
    }
    public static void scannerFromString() {
        Scanner scanner = new Scanner("1 5");
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
    }

    public static void scannerFromFile() {
        try {
            java.io.File file = new java.io.File("scores.txt");

            Scanner input = new Scanner(file);
           // Read data from a file
            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
            }
            // Close the file
            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
