package map_tree;

public class GiaiThua {
    public static void main(String[] args) {
        int number = 7;
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result *= i;
        }
        System.out.println("7! la" + result);

        System.out.println(giaithua(3));
    }

    public static int giaithua(int number){
        int result = 1;
        if (number > 0) {
            result =  number*giaithua(number - 1);
        }
        return result;
    }
}
