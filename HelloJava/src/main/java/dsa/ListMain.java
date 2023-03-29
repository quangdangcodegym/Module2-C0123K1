package dsa;

import oop.staticjava.Student;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        /**
        List<String> students = new ArrayList<>();
        students.add("Bảo Thi");
        students.add("Phước Đạt");
        students.add("Công Bằng");
        students.add("Công Bằng");
        // students[5], students.length
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
         **/

        Set<Integer> students = new HashSet<>();
        students.add(6);
        students.add(9);
        students.add(7);
        students.add(28);
        students.add(8);
        students.add(21);

        for (Integer s : students) {
            System.out.println(s);
        }





    }
}
