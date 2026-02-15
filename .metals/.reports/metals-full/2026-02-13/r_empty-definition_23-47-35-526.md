error id: file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java:java/io/PrintStream#println().
file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1952
uri: file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java
text:
```scala
// #21 ADJACENCY LIST

// an array/arraylist of linkedlist
// each linkedlist has a unique node at the head
// all adjacent neighbours to that node are added to that node's linkedlist

// time complexity (to check an edge): O(v)
// space complexity O(v + e)

import java.util.ArrayList;
import java.util.LinkedList;

public class adjacency_list {
    public static void main(String[] args){

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}

class Graph{

    ArrayList<LinkedList<Node>> alist;

    Graph(int size){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0); // get the head of the linkedlist
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0); // get the head of the linkedlist
        
        for(Node node : currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }

    void print(){

        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + " --> ");
            }
            System.out.pri@@ntln();
        }
    }
}

class Node{
    
    char data;

    Node(char data){
        this.data = data;
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println().