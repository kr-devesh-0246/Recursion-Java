package arrays.practice;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5};
        int target = 5;

        // simple boolean linear search
//        System.out.println(linearSearch(nums, target, 0));

        // linear search returning the index
//        System.out.println(findIndex(nums, target, 0));

        // linear search returning the index by iterating backwards
//        System.out.println(findIndex(nums, target, nums.length-1));

        // pass the static list and put it inside the method
        findAllIndex(nums, target, 0);


        // modifying arraylist and passing it as parameter of anonymous function
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        anonymous(nums, target, list, 0);
//        System.out.println(list);
        for (int num: list) {
            System.out.println(num);
        }
    }

    private static boolean linearSearch(int[] nums, int target, int index) {
        // base-case
        if (index == nums.length) {
            return false;
        }

        return (nums[index] == target || linearSearch(nums, target, index+1));
    }

    private static int findIndex(int[] nums, int target, int index) {
        // base-case
        if (index == nums.length) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        } else {
            return findIndex(nums, target, index+1);
        }
    }

    // Keep the index array.length as it is iterating backwards
    private static int findIndexBack(int[] nums, int target, int index) {
        // base-case
        if (index == -1) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        } else {
            return findIndexBack(nums, target, index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    // Return each duplicate element which equal to target.
    private static void findAllIndex(int[] nums, int target, int index) {
        // base-case
        if (index == nums.length) {
            return ;
        }

        if (nums[index] == target) {
            list.add(index);
        } else {
            findAllIndex(nums, target, index+1);
        }
    }

    // Return each duplicate element which equal to target
    private static ArrayList<Integer> anonymous(int[] nums, int target, ArrayList<Integer> list, int index) {
        // base-case
        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        return anonymous(nums, target, list, index + 1);
    }
}
