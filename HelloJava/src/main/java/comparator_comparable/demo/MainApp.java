package comparator_comparable.demo;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Quang Dang", 10, 1000.0f);
        employees[1] = new Employee("Quang Minh", 16, 3000.0f);
        employees[2] = new Employee("Quang Khoa", 5, 1000.0f);
        employees[3] = new Employee("Thu Dang", 60, 1000.0f);
        employees[4] = new Employee("My Dang", 8, 1000.0f);
        employees[5] = new Employee("Chau Dang", 15, 1000.0f);
        employees[6] = new Employee("Nghia Dang", 12, 9000.0f);
        employees[7] = new Employee("Bang Dang", 11, 1010.0f);
        employees[8] = new Employee("Quang Dang", 12, 5600.0f);
        employees[9] = new Employee("Quang Dang", 11, 7000.0f);


//        Arrays.sort(employees);
//        sortEmployeesComparable(employees);
//        Comparator comparator = new CompareByAge();
        Comparator comparator = new CompareBySalary();
        Arrays.sort(employees, comparator);

        printArray(employees);

    }

    public static void sortPrimitive() {
        int[] arr = {6, 1, 5, 8, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortEmployeesComparable(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[j].compareTo(employees[i]) < 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    public static void sortEmployessComparator(Employee[] employees, Comparator comparator) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (comparator.compare(employees[i], employees[j]) < 0 ) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    public static void printArray(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
