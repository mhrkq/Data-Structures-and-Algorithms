error id: file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java:java/io/PrintStream#println(+8).
file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 831
uri: file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java
text:
```scala
// #20 ADJACENCY MATRIX

// a 2D array to store 1s and 0s to represent edges
// # of rows = # of unique nodes
// # of columns = # of unique nodes

// time complexity (to check an edge): O(1)
// space complexity: O(v^2)

import java.util.ArrayList;

public class adjacency_matrix {
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

        graph.println();

        System.out.@@println("edge present:" + graph.checkEdge(3, 2));
    }
}

class Graph{

    ArrayList<Node> nodes;

    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
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
        for(Node node : nodes){
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

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).