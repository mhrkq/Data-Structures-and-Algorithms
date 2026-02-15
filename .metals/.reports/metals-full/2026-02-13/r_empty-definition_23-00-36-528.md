error id: file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java:_empty_/matrix#
file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java
empty definition using pc, found symbol in pc: _empty_/matrix#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1242
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

        System.out.println();
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
        @@matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }
    }

    void print(){

        System.out.print("  ");
        for(Node node : alist){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i=0;i<matrix.length;i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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

empty definition using pc, found symbol in pc: _empty_/matrix#