package dsa_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("Testing");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(2, 9);
        ll.add(0,8);
        ll.printList();

    }
}
