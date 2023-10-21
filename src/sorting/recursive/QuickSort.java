package sorting.recursive;

import java.util.Arrays;

public class QuickSort {
    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            // the reason why if its already sorted it will not swap. Hence, it is better than Merge sort.
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 7, 6, 5, 4, 3, 0};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
