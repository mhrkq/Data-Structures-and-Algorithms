// #2 STACKS

// compile = javac <file name>.java
// run = java <class name>

// LIFO = last in first out
// stores objects into a "vertical tower"

// push() = add to the top
// pop() = remove from the top
// peek() = only see the top object in the stack
// empty() = check to see if stack is empty
// search() = Searches for an element and returns its 1-based position (start from 1, not 0) from the top, returns -1 if not found

// uses of stacks:
// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)

import java.util.Stack;

public class stack{
    public static void main(String[] args){

        // Stack<String> is a heap object! not the JVM call stack
        Stack<String> stk = new Stack<String>();

        System.out.println("is stack empty? " + stk.empty());

        stk.push("Minecraft");
        stk.push("Skyrim");
        stk.push("Doom");
        stk.push("Borderlands 3");
        stk.push("FFVII");
        stk.push("Titanfall 2");

        System.out.println("after push");

        System.out.println("is stack empty? " + stk.empty());

        String gameTaken = stk.pop();
        System.out.println("game taken: " + gameTaken);
        System.out.println("games left: " + stk);

        System.out.println("next game: " + stk.peek());

        String gameToSearch = "Doom";
        System.out.println("position of '" + gameToSearch + "' from top of stack: " + stk.search(gameToSearch)); // returns -1 if object not in stack

        // this will lead to an out of memory error from java heap space
        // push() keeps growing an internal array
        // until heap memory runs out
        // for(int i=0;i<1000000000;i++){
        //     stk.push("Fallout76");
        // }
    }
}