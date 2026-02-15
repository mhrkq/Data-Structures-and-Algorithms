// #4 PRIORITY QUEUE

// FIFO = first in first out
// a data struccture that serves elements with the highest priorities first before elements with lower priority

// ascending order for numbers
// alphabetical order

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args){

        Queue<Double> q = new LinkedList<>();

        q.offer(3.0);
        q.offer(4.0);
        q.offer(3.9);
        q.offer(2.7);
        q.offer(3.2);

        while(!q.isEmpty()){
            System.out.println("removed from queue q: " + q.poll());
        }

        System.out.println("is queue q empty? " + q.isEmpty());

        // Queue<Double> q1 = new PriorityQueue<>(); // the elements will be sorted in ascending order
        Queue<Double> q1 = new PriorityQueue<>(Collections.reverseOrder()); // the elements will be sorted in descending order

        q1.offer(3.0);
        q1.offer(4.0);
        q1.offer(3.9);
        q1.offer(2.7);
        q1.offer(3.2);

        while(!q1.isEmpty()){
            System.out.println("removed from queue q: " + q1.poll());
        }

        System.out.println("is queue q empty? " + q1.isEmpty());
    }
}
