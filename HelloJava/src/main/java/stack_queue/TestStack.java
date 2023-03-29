package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {


        // thiết kế 1 hàm
        int[] numbers = {7, 3, 1, 5, 4};

//        reverseArray(numbers);
//        System.out.println(Arrays.toString(numbers));

        // viết hàm đầu vào 1 con số, đầu ra 1 chuỗi nhị phân:


        System.out.println(binaryNumber(17));

    }

    public static void stackbasic() {
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Lấy phần tử từ stack
        int x = stack.pop();
        System.out.println(x); // Output: 3

        // Kiểm tra phần tử đầu tiên trong stack
        int y = stack.peek();
        System.out.println(y); // Output: 2

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        int j = 0;
        while (!stack.empty()) {
            numbers[j] = stack.pop();
            j++;
        }
    }

    public static String binaryNumber(int x) {
        Stack<Integer> s = new Stack<>();
        while (x != 0) {
            int sodu = x % 2;
            s.push(sodu);
            x = x / 2;
        }
        String str = "";
        while (!s.empty()) {
            str += s.pop();
        }
        return str;
    }
}
