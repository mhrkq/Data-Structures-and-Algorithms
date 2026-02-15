// #9 LINEAR SEARCH

// iterate through a collection 1 element at a time

// runtime complexity: O(n)

// pros:
// fast for searches of small to medium datasets
// does not need to be sorted
// useful for data structures that do not have random access (LinkedList)

// cons: 
// slow for large datasets

public class linear_search {
    public static void main(String[] args){

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int val = 5;

        int index = linearSearch(array, val);

        if(index != -1){
            System.out.println("Element '" + val + "' found at index: " + index);
        }
        else{
            System.out.println("Element '" + val + "' not found.");
        }
    }

    private static int linearSearch(int[] array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
