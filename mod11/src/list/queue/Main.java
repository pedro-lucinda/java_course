package list.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);

        // removes and returns the head of the queue
        System.out.println(queue.poll());
        // returns the head of the queue without removing it
        System.out.println(queue.peek());

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addLast(2);

        // removes and returns the first element of the deque
        System.out.println(deque.pollFirst());
        // removes and returns the last element of the deque
        System.out.println(deque.pollLast());
        // returns the first element of the deque without removing it
        System.out.println(deque.peekFirst());
        // returns the last element of the deque without removing it
        System.out.println(deque.peekLast());
        // adds the element to the front of the deque
        deque.offerFirst(3);
        // adds the element to the end of the deque
        deque.offerLast(4);

        System.out.println(deque);

    }
}
