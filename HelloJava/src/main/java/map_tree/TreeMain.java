package map_tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeMain {

    public static void main(String[] args) {


    }
    public static void mapBasic() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Thi Thi");
        map.put(2, "HCB");
        map.put(3, "Phap su");

        System.out.println(map.get(3));
        System.out.println(map.containsKey(5));

        System.out.println("---------------------Dung Set<Integer>");
        Set<Integer> keys = map.keySet();
        for (Integer item : keys) {
            System.out.println(map.get(item));
        }

        System.out.println("---------------------Dung et<Map.Entry<Integer, String>>");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> item : entrySet){
            System.out.println(item.getValue());
        }
        System.out.println("---------------------Dung collection");
        Collection<String> values = map.values();
        for (String item : values) {
            System.out.println(item);
        }
    }

    public static void mapBasic1() {
        Map<Student, String> map = new HashMap<>();

        map.put(new Student("ThyThy"), "ID1");
        map.put(new Student("ThyThy"), "ID5");

        Set<Student> keys = map.keySet();
        for (Student item : keys) {
            System.out.println(map.get(item));
        }
    }
    public static void mapBasic0(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Thi Thi");
        map.put(2, "HCB");
        map.put(3, "Phap su");
        map.put(2, "HCV");

        System.out.println("---------------------Dung Set<Integer>");
        Set<Integer> keys = map.keySet();
        for (Integer item : keys) {
            System.out.println(map.get(item));
        }
    }
}
