// #7 LINKEDLIST VS ARRAYLIST

// arraylist faster at accessing element
// linkedlist faster at inserting/removing element
// also depends on the position of the target element

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist_vs_arraylist {
    public static void main(String[] args){

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0;i<1000000;i++){
            ll.add(i);
            arr.add(i);
        }

        // LINKED LIST -------------------
        startTime = System.nanoTime(); // JVM time source

        // ll.get(0);
        // ll.get(500000);
        // ll.get(999999);
        // ll.remove(0);
        // ll.remove(500000);
        ll.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // ARRAY LIST -------------------
        startTime = System.nanoTime(); // JVM time source

        // arr.get(0);
        // arr.get(500000);
        // arr.get(999999);
        // arr.remove(0);
        // arr.remove(500000);
        arr.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
