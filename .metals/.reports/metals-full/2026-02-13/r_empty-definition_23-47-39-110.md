error id: file:///D:/work/Data-Structures-and-Algorithms/depth_first_search.java:_empty_/node#
file:///D:/work/Data-Structures-and-Algorithms/depth_first_search.java
empty definition using pc, found symbol in pc: _empty_/node#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1463
uri: file:///D:/work/Data-Structures-and-Algorithms/depth_first_search.java
text:
```scala
// #22 DEPTH FIRST SEARCH

// a search algorithm for traversing a tree or graph data structure

// 1. pick a route
// 2. keep going until you reach a dead end, or a previously visited node
// 3. backtrack to last node that has unvisited adjacent neighbours

// time complexity

public class depth_first_search {
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

    ArrayList<Node> nodes;

    int[][] matrix;

    Graph(int size){
        
    }

    public void addNode(Node node){

    }

    public void addEdge(int src, int dst){

    }

    public boolean checkEdge(int src, int dst){

    }

    void print(){
        
    }

    void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    void dFSHelper(int src, boolean[] visited){

        if(visited[src]){
            return;
        }
        else{
            visited[src] = true;
            System.out.print(nod@@e.data + " --> ");
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

empty definition using pc, found symbol in pc: _empty_/node#