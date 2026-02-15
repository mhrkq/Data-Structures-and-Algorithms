// #10 BINARY SEARCH

// a search algorithm that finds the position of a target value within a sorted array
// half of the array is eliminated during each "step"

// the array must be sorted before doing binary search!

// process:
// begin in the middle of the array
// if value of middle element == target value, return value
// else check if 
// 1. target value > middle value - discard array with values < middle value and repeat process
// 2. target value < middle value - discard array with values > middle value and repeat process

public class binary_search {
    public static void main(String[] args){
        int array[] = new int[1000000];
        int target = 42069;

        for(int i=0;i<array.length;i++){
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println(target + " not found.");
        }
        else{
            System.out.println(target + " found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {

        int step = 0;
        
        int low = 0;
        int high = array.length - 1;
        // int middle = low + (high - low) / 2;

        // while(middle != target){ // if target does not exist in the array, the loop will never end
        //     if(target < middle){
        //         high = middle;
        //         middle = (int)(high/2); 
        //     }
        //     else{
        //         low = middle;
        //         middle = (int)((high - middle) / 2);
        //     }
        // }

        while(low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            step++;
            System.out.println("step " + step + " middle: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle -1;
            else return middle; // target found
        }

        return -1; // target not found
    }
}
