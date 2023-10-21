package arrays;

public class IsSorted {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        boolean flag = isSorted(nums, 0);
        System.out.println(flag);
    }

    private static boolean isSorted(int[] arr, int index) {
        // base-case
        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index+1] && isSorted(arr, index+1));
    }
}
