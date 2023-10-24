package subseqence_subset_string_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subset(arr));

        int[] nums = {1,2,2};
        System.out.println(subsetWithoutDuplicates(nums));
    }

    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();

        // Initially the outer list contains [[]]
        outer.add(new ArrayList<>()); // Thus a new empty list added

        // using the for each loop is more clean
        for (int num: nums) {
            int n = outer.size(); // when the size of list is n. We create n new lists
            // We looped to create those n new lists
            for (int i = 0; i < n; i++) {
                // to add to corresponding lists
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // accepting/adding the number into internal list
                // internal list is the individual arraylist contained in the outer loop
                internal.add(num);
                // updating the outer list
                outer.add(internal);
            }
        }

        return outer;
    }

    public static List<List<Integer>> subsetWithoutDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // Thus a new empty list added
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            // if the current and previous element is same, s = e+1
            if (i > 0 && nums[i] == nums[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
