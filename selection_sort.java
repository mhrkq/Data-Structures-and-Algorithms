// #13 SELECTION SORT

// start at index 0
// assume the first unsorted element is the minimum
// scan the rest of the array to find the actual smallest element
// swap the smallest element with the first unsorted position element (put in temp)
// move the first unsorted position element (from temp) to where the smallest element's old position
// move the boundary of the unsorted portion one step to the right
// repeat until the array is fully sorted

// time complexity: O(n^2)
// ok for small datasets
// bad for large datasets

public class selection_sort {
    public static void main(String[] args){

        int[] array = {8, 7, 2, 9, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min] > array[j]){ // ascending order
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
