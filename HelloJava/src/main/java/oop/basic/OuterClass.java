package oop.basic;

public class OuterClass {
    private   int number_OuterClass;
    static class StaticNestedClass{
        public StaticNestedClass() {
            // Không thể truy cập thuộc tính bên ngoài
//            System.out.println(number_OuterClass);
        }
    }
    class InnerClass{
        public InnerClass() {
            // Có thể truy cập thuộc tính bên ngoài
            System.out.println(number_OuterClass);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    }
}
