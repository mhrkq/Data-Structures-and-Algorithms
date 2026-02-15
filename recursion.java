// #15 RECURSION

// commonly used with advanced sorting algorithms and navigating trees

// pros:
// easier to read/write
// easier to debug

// cons:
// sometimes slower
// uses more memory

// call stack:
// (LIFO)

// [ walk(0) ] <-- TOP
// [ walk(1) ]
// [ walk(2) ]
// [ walk(3) ]
// [ walk(4) ]
// [ walk(5) ]
// [ main()  ]

// finish executing walk(0), go to walk(1), and so on, until main() finish executing

public class recursion {
    public static void main(String[] args){

        walkiteration(5);
        walkrecursion(5);

        int num = 7;
        int fact = factorial(num);
        System.out.println("factorial of " + num + " is " + fact); 

        int base = 2;
        int exponent = 8;
        int power = power(base, exponent);
        System.out.println("power of " + base + "^" + exponent + " is " + power); 
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent - 1); // recursive case
    }

    private static int factorial(int num) {
        
        if(num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive case
    }

    private static void walkrecursion(int steps) {
        
        if(steps < 1) return; // base case
        System.out.println("You have taken a step..."); // recursive case
        walkrecursion(steps - 1);
    }

    private static void walkiteration(int steps) {
        
        for(int i=0;i<steps;i++){
            System.out.println("You take a step. steps taken: " + (i+1));
        }
    }
}
