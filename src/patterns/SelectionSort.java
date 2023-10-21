package patterns;

import java.util.Arrays;

public class SelectionSort {
    private static void selection(int[] arr, int r, int c, int max) {
        // max is the index of max element
        if (r == 1) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            // update the new max element
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selection(arr, r-1, 0, 0);
        }

    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
