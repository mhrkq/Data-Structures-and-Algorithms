error id: file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java:_empty_/Array#length.
file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java
empty definition using pc, found symbol in pc: _empty_/Array#length.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1281
uri: file:///D:/work/Data-Structures-and-Algorithms/adjacency_matrix.java
text:
```scala
// #20 ADJACENCY MATRIX

// a 2D array to store 1s and 0s to represent edges
// # of rows = # of unique nodes
// # of columns = # of unique nodes

// time complexity (to check an edge): O(1)
// space complexity: O(v^2)

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
    }
}

class Graph{

    int[][] matrix;

    Graph(int size){
        matrix = new int[size][size];
    }

    public void addNode(Node node){

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

    void print{
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.@@length;j++){

            }
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

empty definition using pc, found symbol in pc: _empty_/Array#length.