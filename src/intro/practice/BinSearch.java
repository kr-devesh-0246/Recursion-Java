package intro.practice;

public class BinSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 40;
        System.out.println(binarySearch(nums, target, 0, nums.length - 1));
        System.out.println(binarySearch2(nums, target, 0, nums.length - 1));
    }

    static boolean binarySearch(int[] nums, int target, int start, int end) {
        // missed this check
        if (start > end) {
            System.out.println("Element not found");
            return false;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return true;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        }

        return binarySearch(nums, target, start, mid - 1);
    }

    static int binarySearch2(int[] nums, int target, int start, int end) {
        // I missed this check
        if (start > end) {
            return -1; // element not found
        }
        int mid = start + (end - start) / 2;

        // base-case
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch2(nums, target, mid + 1, end);
        }

        return binarySearch2(nums, target, start, mid-1);
    }
}
