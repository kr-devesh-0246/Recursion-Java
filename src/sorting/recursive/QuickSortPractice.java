package sorting.recursive;

import java.util.Arrays;

public class QuickSortPractice {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int low, int high) {
        // base case
        if (low >= high) {
            return ;
        }

        int s = low;
        int e = high;

        // You could take any pivot. I will take mid
        int m = (s + e) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            // swap only when start <= end
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Now my pivot is at correct index, please sort two halves now
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
