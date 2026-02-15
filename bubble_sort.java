// #12 BUBBLE SORT

// array is like a body of water
// light elements will float to the top (left)
// heavy elements will sink to the bottom (right)

// compare the first two elements
// if first > second: swap
// move to the next pair (second and third elements) and repeat
// after one full pass, the largest element is at the end
// repeat the process for the remaining unsorted portion

// time complexity: O(n^2)
// ok for small datasets
// bad for large datasets

public class bubble_sort {
    public static void main(String[] args){

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                // if(array[j] > array[j+1]){ // ascending order
                if(array[j] > array[j+1]){ // descending order
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
