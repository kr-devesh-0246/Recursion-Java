package sorting.non_recursive;

import java.util.Arrays;

public class CyclicSort {
    private static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
    }
    private static void cyclic(int[] arr) {
        int cycleStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
//                swap(arr[i], )
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}

