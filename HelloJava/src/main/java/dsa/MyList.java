package dsa;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // khởi tạo phương thức ensureCapa()
    // dùng để kiểm tra độ dài mảng và tăng gấp đôi mảng đó lên 2 lần
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //khởi tạo phương thức add(E e) với đối số e kiểu E
    //E đại diện cho kiểu dữ liệu của phần tử được thêm vào danh sách
    //Phương thức add(E e) dùng để kiểm tra độ dài của mảng đến mức tối đa
    // và sau đó sẽ gọi đến phương thức ensureCapa() đề tăng kích thước lên 2 lần.
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
//        elements[size++] = e;
        elements[size] = e;
        size++;
    }

    //Phương thức public E get(int i) có nhiệm vụ trả về phần tử ở vị trí i trong danh sách.
    //trong đo dữ liệu E chưa xác định
    public E get(int i) {
        if (i >= size || i < 0) {
            // dùng để thông báo ngoại lệ khi nhập sai vị trí và độ dài
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        //ép kiểu E cho elements[i]
        return (E) elements[i];
    }
    public void remove(int index){
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size-1] = null;
        size--;
    }

    public void remove(int index, int number) {
        for (int i = index; i < size - number; i++) {
            elements[i] = elements[i + number];
            elements[i+ number] = null;
        }
        size = size-number;
    }

    public MyList<Integer> subArray(int from, int end) {
//        return ...
        MyList<Integer> arrNew = new MyList<>();
        for (int i = from; i <= end; i++) {
            arrNew.add((Integer) this.get(i));
        }
        return arrNew;
    }

    public boolean isChildArray(MyList<E> myList) {

        for (int i = 0; i < size; i++) {
            if (elements[i] == myList.get(0)) {
                boolean flag = true;
                for (int j = 0; j < myList.size; j++) {
                    if (myList.get(j) != elements[i + j]) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {



        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(10);


        MyList<Integer> child = new MyList<Integer>();

        child.add(3);
        child.add(3);
        child.add(4);

        boolean check = listInteger.isChildArray(child);
        System.out.println(check);

//        listInteger.remove(2);
//
//        System.out.println("element 4: "+listInteger.get(4));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
//
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
    }

}
