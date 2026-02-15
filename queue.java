// #3 QUEUE

// FIFO = first in first out
// a colelction designed for holding elements prior to processing
// linear data structure

// add = enqueue, offer()
// remove = dequeue, poll()
// look at head of queue = peek()
// check if queue is empty = isEmpty()
// check how long the queue is = size()
// check if an object is in the queue = contains()

// Queue type is an interface
// LinkedList and PriorityQueue implement Queue

// uses of queue:
// 1. keyboard buffer (letters should appear on the screen in the order they're pressed)
// 2. printer queue (print jobs should be completed in order)
// 3. used in LinkedList, PriorityQueues, Breadth-first search

import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args){

        // Queue<String> q = new Queue<String>(); // cannot instantiate the type queue as it is an interface, not a class
        Queue<String> q = new LinkedList<String>();

        System.out.println("before offer, is queue empty? " + q.isEmpty());

        q.offer("Karen");
        q.offer("Chad");
        q.offer("Steve");
        q.offer("Harold");
        q.offer("Arthur");

        System.out.println("after offer, is queue empty? " + q.isEmpty());

        System.out.println("current queue q: " + q);

        System.out.println("next in line: " + q.peek()); // look at object at the head of the queue
        
        q.poll(); // will not cause exceptions
        q.poll();
        // q.element(); // using 'element' to peek will cause an exception

        System.out.println("after some time... (poll x2)");
        System.out.println("next in line: " + q.peek());
        System.out.println("how many in queue: " + q.size());
        System.out.println("current queue q: " + q);
        
        String person = "Harold";
        System.out.println("is " + person + " in the queue? " + q.contains(person));
        
    }
}
