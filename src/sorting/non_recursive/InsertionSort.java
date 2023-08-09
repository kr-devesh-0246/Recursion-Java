package sorting.non_recursive;

import java.util.Arrays;
public class InsertionSort {

    private static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            int j = i+1;
            while (j > 0) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
                j = j-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,5,4,3,2,0,-4,30};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
