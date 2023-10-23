// Doing linear search using recursion
package arrays;

import java.util.ArrayList;

public class Search {
    /*
    private static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) { // is goes up to arr.length bcs we want to include the last element
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndex(arr, target, index+1);
    }
    */

    /*
    private static int searchIndexFromBack(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndexFromBack(arr, target, index-1);
    }
    */

    /*
    private static boolean searchIsPresent(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || searchIsPresent(arr, target, index+1);
    }
    */

    /*
    private static boolean searchIsPresentFromBack(int[] arr, int target, int index) {
        if (index == -1) {
            return false;
        }
        return arr[index] == target || searchIsPresentFromBack(arr, target, index-1);
    }

    */


  /*
    static ArrayList<Integer> list = new ArrayList<>();
    private static void searchAllIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return;
        }
        if(target == arr[index]) {
            list.add(index);
        }
        // since this function returns void, we just call the function recursively without returning it
        searchAllIndex(arr, target, index+1);
    }
   */

    /* What if we want to put the ArrayList in the argument, not outside?
       There are 2 ways to do this: 1. Taking in as argument and 2. Creating it inside body*/
    /*
    private static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length){
            return list;
        }
        if(target == arr[index]) {
            list.add(index);
        }
        return searchAllIndex(arr, target, index+1, list);
    }
    */

    // It's not good to create a new object at each call. Previous method was more space optimised
    private static ArrayList<Integer> searchAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain the answer for that function call only
        if (target == arr[index]) {
            list.add(index);
        }
        // to store the answers from below function calls into the list
        ArrayList<Integer> ansFromBelowCalls = searchAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6};
//        System.out.println(searchIndex(arr, 3, 0)); // returns the index of target
//        System.out.println(searchIndexFromBack(arr, 3, 5));
//
//        System.out.println(searchIsPresent(arr, 3, 0)); // returns whether target is present or not
//        System.out.println(searchIsPresentFromBack(arr, 3, 5));
//
//        searchAllIndex(arr, 3, 0);
//        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(searchAllIndex(arr, 3, 0, list));

//        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(searchAllIndex2(arr, 3, 0));
    }
}
