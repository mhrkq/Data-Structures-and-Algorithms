// #18 HASH TABLE

// a data structure that stores unique keys to values, e.g. <Integer, String>
// key value pair = entry
// fast insertion, look up, deletion of key/value pairs
// not ideal for small datasets, great with large datasets

// slot an entry into a hashtable using:
// key.hashCode() % capacity (length of hashtable) = index

// collision = when an entry is allocated to an index that aalready has an entry
// turn the bucket (storage location at the index) into a linked list
// the first entry has an address of the next entry, and so on
// less collisions = more efficient

// time complexity: 
// best case - O(1)
// worst case - O(n)

import java.util.Hashtable;

public class hash_table {
    public static void main(String[] args){
        // Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f); // size and load factor of hash table
        Hashtable<Integer, String> table = new Hashtable<>(10);
        
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        
        // table.remove(777);
        System.out.println("integer key hash table: ");
        
        for(Integer key : table.keySet()){ // take all keys and turn them into a set, which can be iterated over
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
        
        // Hashtable<String, String> table1 = new Hashtable<>(10);
        Hashtable<String, String> table1 = new Hashtable<>(21);
        // can increase size of hash table to decrease chance of collision
        // but this takes more memory
        
        table1.put("100", "Spongebob");
        table1.put("123", "Patrick");
        table1.put("321", "Sandy");
        table1.put("555", "Squidward");
        table1.put("777", "Gary");
        
        System.out.println("string key hash table: ");

        for(String k : table1.keySet()){ // take all keys and turn them into a set, which can be iterated over
            // System.out.println(k.hashCode() % 10 + "\t" + k + "\t" + table1.get(k));
            System.out.println(k.hashCode() % 21 + "\t" + k + "\t" + table1.get(k));
        }
    }
}
