package stack_queue;

public class MyStack<E> {
    private static final int INITIAL_SIZE = 3;
    private E[] elements;
    private int count = 0;
    public MyStack() {
        elements = (E[]) new Object[INITIAL_SIZE];
    }
    public void push(E e){
        ensureCapacity();
        // count = 0
//        elements[count++] = e;
        elements[count] = e;
        count++;
    }

    public E pop(){
        if(count == 0){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        E e = elements[count - 1];
        elements[count - 1] = null;
        count--;
        return e;
    }
    private void ensureCapacity() {
        if(count >= elements.length){
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 2, count);
            elements = newElements;
        }
    }

    // Viết hàm kiếm tra stack rổng hay không
    // Viết hàm peek() của stack

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

    }
}
