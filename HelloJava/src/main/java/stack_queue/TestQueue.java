package stack_queue;

import java.util.PriorityQueue;

public class TestQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(3);
        queue.add(1);


        System.out.println(queue.poll());

        System.out.println(queue.peek());

//        System.out.println(queue.re);
    }
}
