package dsa_linkedlist;

public class MyLinkedList {
    private Node head;      // null
    private int numNodes;   // 0

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    //    thêm phương thức addFirst(thêm đối tượng vào vị trí đầu trong danh sách)
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    //
    private class Node {
        private Node next;          // null
        private Object data;        // null

        public Node (Object data){
            this.data = data;
        }
        // cài đặt phương thức get() (lấy phần tử ở vị trí index từ danh sách)
        public Object getData() {
            return this.data;
        }
    }
    //cài đặt phương thức add
    public void add (int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        // Ngang dòng này: holder là node nào, temp là node nào
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    //cài đặt phương thức get() (lấy phần ử ở vị trí index)
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        } return temp;
    }
    // cài đặt phương thức printList (hiển thị các phần tử trong danh sách)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}