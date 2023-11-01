package arrays.practice1;

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
//        findAllIndex(nums, target, 0);
//        System.out.println("List of index: " + list);


        // modifying arraylist and passing it as parameter of anonymous function
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        findIndices1(nums, target, list, 0);
//        System.out.println(list);
//        for (int num: list) {
//            System.out.println(num);
//        }

        // Method to return an arraylist 1 (Taking Arraylist in parameter)
//        ArrayList<Integer> inputList1 = new ArrayList<>();
//        findIndices1(nums, target, 0, inputList1);
//        System.out.println(inputList1);
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


    // Return each duplicate element which equal to target.
    static ArrayList<Integer> list = new ArrayList<>(); // uncomment before calling method
    private static void findAllIndex(int[] nums, int target, int index) {
        // base-case
        if (index == nums.length) {
            return ;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        findAllIndex(nums, target, index+1);
    }


    // Return each duplicate element which equal to target
    private static ArrayList<Integer> findIndices1(int[] nums, int target, int index, ArrayList<Integer> list) {
        // base-case
        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        return findIndices1(nums, target, index + 1, list);
    }

    private static ArrayList<Integer> findIndices2(int[] nums, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        // base-case
        if (index == nums.length) {
            return list;
        }


        if (nums[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findIndices2(nums, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
