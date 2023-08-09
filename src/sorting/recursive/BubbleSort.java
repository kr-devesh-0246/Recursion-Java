package sorting.recursive;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] arr, int r, int c) {
        // base-case
        if (r == 0) {
            return;
        }
        if (r > c) {

            if (arr[c] > arr[c+1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c+1);
        } else {
            bubble(arr, r-1, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,32,4,3,2,5,24,4,4,3,2,23,4,9};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
