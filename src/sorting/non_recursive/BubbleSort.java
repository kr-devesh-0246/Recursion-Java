package sorting.non_recursive;

import java.util.Arrays;

public class BubbleSort {
    private static void bubble(int[] arr) {
        // appreciate how the swapped variable is implemented
        boolean swapped;
        // run for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // swap if the element is smaller than the previous item
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swapped for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
