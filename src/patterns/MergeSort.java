

package patterns;

import java.util.Arrays;

public class MergeSort {
    /*Out-of-Place Algorithm*/
    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // In cases where first and second have different sizes, one will be left incomplete
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

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e-s == 1) {
            return;
        }
        int mid = s + (e - s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // In cases where first and second have different sizes, one will be left incomplete
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Now copying the sorted array from mix to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
        // optimisation, but i dont know how to use it
//        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        // Out-Of-Place Algo

        // In no way, original array was modified
        // mergeSort() returned a modified copy.
//        arr = mergeSort(arr); // Can remove this
//        int[] ans = mergeSort(arr);
//        System.out.println("Original array: " + Arrays.toString(arr));
//        System.out.println("New object storing the copy of array" + Arrays.toString(ans));

        // InPlace Algo
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println("InPlace: " + Arrays.toString(arr));
    }
}
