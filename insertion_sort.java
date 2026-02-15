// #14 INSERTION SORT

// start with the second element
// compare it with elements to its left
// shift larger elements one position to the right
// insert the element into its correct position
// repeat until all elements are sorted

// time complexity: O(n^2)
// ok for small datasets
// bad for large datasets

// less steps than Bubble Sort
// best case is O(n) compared to Selection Sort O(n^2)

public class insertion_sort {
    public static void main(String[] args){

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] array){

        for(int i=1;i<array.length;i++){

            int temp = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;
        }
    }
}