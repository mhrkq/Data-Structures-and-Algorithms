error id: file:///D:/work/Data-Structures-and-Algorithms/breadth_first_search.java:java/lang/System#
file:///D:/work/Data-Structures-and-Algorithms/breadth_first_search.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2248
uri: file:///D:/work/Data-Structures-and-Algorithms/breadth_first_search.java
text:
```scala
// #22 BREADTH FIRST SEARCH

// a search algorithm for traversing a tree or graph data structure
// done one "level" at a time, rather than one "branch" at a time

// 

import java.util.ArrayList;
import java.util.LinkedList;

public class breadth_first_search {
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

        graph.breadthFirstSearch(4);
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

    void breadthFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            src = queue.poll();
        }
    }

    void dFSHelper(int src, boolean[] visited){

        if(visited[src]){
            return;
        }
        else{
            visited[src] = true;
            @@System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i=0;i<matrix[src].length;i++){ // length of a row of the adjacency matrix
            if(matrix[src][i] == 1){
                dFSHelper(i, visited); // check if there is an adjacent neighbour we can travel to
            }
        }
        return;
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

empty definition using pc, found symbol in pc: java/lang/System#