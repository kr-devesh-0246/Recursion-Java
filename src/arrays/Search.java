// Doing linear search using recursion
package arrays;

public class Search {
    private static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndex(arr, target, index+1);
    }

    private static int searchIndexFromBack(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndexFromBack(arr, target, index-1);
    }
    private static boolean searchIsPresent(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || searchIsPresent(arr, target, index+1);
    }
    private static boolean searchIsPresentFromBack(int[] arr, int target, int index) {
        if (index == -1) {
            return false;
        }
        return arr[index] == target || searchIsPresentFromBack(arr, target, index-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(searchIndex(arr, 3, 0));
        System.out.println(searchIsPresent(arr, 3, 0));
        System.out.println(searchIndexFromBack(arr, 3, 5));
        System.out.println(searchIsPresentFromBack(arr, 3, 5));
    }
}
