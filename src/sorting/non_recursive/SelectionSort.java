package sorting.non_recursive;

import java.util.Arrays;

public class SelectionSort {
    private static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int s, int e) {
        int max = s;
        for (int i = s; i <= e; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,4,3,4,2,3,1,0};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
