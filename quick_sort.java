// #17 QUICK SORT

// choose a pivot element (e.g., first, last, or middle element)
// partition the array:
//    - move all elements smaller than the pivot to its left
//    - move all elements larger than the pivot to its right
// place the pivot in its correct sorted position
// recursively apply Quick Sort to the left subarray
// recursively apply Quick Sort to the right subarray
// repeat until subarrays have 0 or 1 element

// time complexity: 
// best case = O(n log n)
// average case = O(n log n)
// worst case = O(n^2) if already sorted

// space complexity: O(log n) due to recursion

public class quick_sort {
    public static void main(String[] args){

        int[] array = {8, 2, 5, 4, 3, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        
        if(end <= start) return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j=start;j<=end-1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        
        return i;
    }
}
