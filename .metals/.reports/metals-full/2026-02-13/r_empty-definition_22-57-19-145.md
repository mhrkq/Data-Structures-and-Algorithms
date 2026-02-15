error id: file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java:_empty_/node#
file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java
empty definition using pc, found symbol in pc: _empty_/node#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 942
uri: file:///D:/work/Data-Structures-and-Algorithms/adjacency_list.java
text:
```scala
// #21 ADJACENCY LIST

// an array/arraylist of linkedlist
// each linkedlist has a unique node at the head
// all adjacent neighbours to that node are added to that node's linkedlist

// time complexity (to check an edge): O(v)
// space complexity O(v + e)

public class adjacency_list {
    public static void main(String[] args){

    }
}

class Graph{

    ArrayList<LinkedList<Node>> alist;

    Graph(int size){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        alist.add(node);
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
        for(Node alist : nodes){
            System.out.print(no@@de.data + " ");
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

empty definition using pc, found symbol in pc: _empty_/node#