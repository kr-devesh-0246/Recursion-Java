package sorting.recursive;

import java.util.Arrays;

public class MergeSortGrind {
    public static void main(String[] args) {
        int[] arr = new int[] {8,3,4,12,5,6};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        /*
        int[] sorted_arr = mergeSortOutOfPlace(arr);
        System.out.println(Arrays.toString(sorted_arr));
        */
    }

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return ;
        }

        int m = (s + e) / 2; // m is mid

        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        // did not return anything as it is manipulating the original array at last
        mergeInPlace(arr, s, m, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, s, mix.length);

    }

    /*Out Of Place*/
    private static int[] mergeSortOutOfPlace(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSortOutOfPlace(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortOutOfPlace(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeOutOfPlace(left, right);
    }

    private static int[] mergeOutOfPlace(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // if length of arrays are unequal
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}