error id: file:///D:/work/Data-Structures-and-Algorithms/hash_table.java:java/util/Hashtable#
file:///D:/work/Data-Structures-and-Algorithms/hash_table.java
empty definition using pc, found symbol in pc: java/util/Hashtable#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1291
uri: file:///D:/work/Data-Structures-and-Algorithms/hash_table.java
text:
```scala
// #18 HASH TABLE

// key value pair = entry

// slot an entry into a hashtable using:
// key.hashCode() % capacity (length of hashtable)

// collision = when an entry is allocated to an index that aalready has an entry
// turn the bucket (storage location at the index) into a linked list
// the first entry has an address of the next entry, and so on

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
        Hashtable<String, String> table1 = new Hashtabl@@e<>(21);
        // can increase size of hash table to decrease chance of collision
        // but this takes more memory
        
        table1.put("100", "Spongebob");
        table1.put("123", "Patrick");
        table1.put("321", "Sandy");
        table1.put("555", "Squidward");
        table1.put("777", "Gary");
        
        System.out.println("string key hash table: ");

        for(String k : table1.keySet()){ // take all keys and turn them into a set, which can be iterated over
            System.out.println(k.hashCode() % 10 + "\t" + k + "\t" + table1.get(k));
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Hashtable#