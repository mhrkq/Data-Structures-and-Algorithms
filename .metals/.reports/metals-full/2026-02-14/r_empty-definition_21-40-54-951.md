error id: file:///D:/work/Data-Structures-and-Algorithms/binary_search_tree.java:_empty_/removeHelper#
file:///D:/work/Data-Structures-and-Algorithms/binary_search_tree.java
empty definition using pc, found symbol in pc: _empty_/removeHelper#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2892
uri: file:///D:/work/Data-Structures-and-Algorithms/binary_search_tree.java
text:
```scala
// #22 BINARY SEARCH TREE

// value of left child < value of parent < value of right child
// e.g.

//      4
//    /   \
//   2     6
//  / \   / \
// 1   3 5   7

// time complexity: O(log n)

public class binary_search_tree {
    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.insert(new Node(6));

        tree.display();

        System.out.println(tree.search(3));
        // tree.search(6);
    }
}

class BinarySearchTree{

    Node root;

    public void insert(Node node){

        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){

        int data = node.data;

        if(root == null){
            root = node;
            return root;
        }
        else if(data < root.data){
            root.left = insertHelper(root.left, node); // left child becomes the root of the sub tree in this recursion
        }
        else{
            root.right = insertHelper(root.right, node); // right child becomes the root of the sub tree in this recursion
        }

        return root;
    }

    public void display(){

        displayHelper(root);
    }

    private void displayHelper(Node root){

        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){

        if(root == null){
            System.out.println("Data not found.");
            return false;
        }
        else if(root.data == data){
            System.out.println("Data found.");
            return true;
        }
        else if(root.data > data){
            System.out.println(root.data + " > " + data + ". Checking left child...");
            return searchHelper(root.left, data);
        }
        else{
            System.out.println(root.data + " < " + data + ". Checking right child...");
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){

        if(search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found, unable to remove.");
        }
    }

    public Node removeHelper(Node root, int data){

        if(root == null){
            return root;
        }
        else if(data < root.data){
            root.left = removeHe@@lper
        }
        return null;
    }

    private int successor(Node root){
        return 0;
    }

    private int predecessor(Node root){
        return 0;
    }
}

class Node{
    
    int data;

    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/removeHelper#