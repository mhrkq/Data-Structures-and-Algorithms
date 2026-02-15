// #5 LINKED LIST

// all Java collections use base 0 indexing! not to confuse with stack's search() that use base 1

// linked list vs array/arraylist

// arraylist
// store elements in contiguous memory locations
// good at randomly searching and accessing elements because of indexing
// bad at inserting and removing elements, especially near the start of the array (need to shift all elements to the right/left to make room for insertion/deletion)

// linked list
// non-contiguous
// data | address --> data | address --> data | address --> data | address --> data | address --> data | null
// address = pointer to where the next node is located
// bad at searching (linear time O(n))
// good at insertion and deletion (constant time O(1))

// doubly linked list
// null | data | address <--> address | data | address <--> address | data | address <--> address | data | address <--> address | data | null
// pros: able to traverse head to tail, and tail to head
// cons: uses more memory than a linked list

// linked list pros:
// dynamic data structure (allocates needed memory while running)
// no/low memory waste
// insertion/deletion of nodes is easy - O(1)

// linked list cons:
// greater memory usage (additional pointer)
// no random access of elements (no index[i])
// accessing/searching elements is more time consuming - O(n)

// linked list uses:
// 1. implement Stacks/Queues
// 2. GPS navigation
// music playlist

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args){

        LinkedList<String> ll = new LinkedList<String>(); // double linked list that implements the double-ended queue interface

        ll.push("A");
        ll.push("G");
        ll.push("R");
        ll.push("B");
        ll.push("M");

        System.out.println(ll);

        ll.pop();

        System.out.println(ll); // LIFO - last in first out, just like stack

        LinkedList<String> ll1 = new LinkedList<String>(); // notice that stack and queue have opposite orders

        ll1.offer("A");
        ll1.offer("G");
        ll1.offer("R");
        ll1.offer("B");
        ll1.offer("M");

        System.out.println(ll1);

        ll1.poll();

        System.out.println(ll1); // FIFO - first in first out, just like queue

        ll1.add(2, "ZZZ");

        System.out.println("added new element at index 2: " + ll1);

        ll1.remove("ZZZ");

        System.out.println("removed element at index 2: " + ll1);

        System.out.println("index of 'B': " + ll1.indexOf("B"));

        System.out.println("first node of linked list using peek: " + ll1.peek());

        System.out.println("first node of linked list using peekFirst: " + ll1.peekFirst());

        System.out.println("last node of linked list using peekLast: " + ll1.peekLast());

        ll1.addFirst("0");
        ll1.addLast("1");

        System.out.println("ll1 after adding first and adding last: " + ll1);

        String first = ll1.removeFirst();
        String last = ll1.removeLast();

        System.out.println("ll1 after removing first and removing last: " + ll1);
        System.out.println("first: " + first);
        System.out.println("last: " + last);
    }
}
