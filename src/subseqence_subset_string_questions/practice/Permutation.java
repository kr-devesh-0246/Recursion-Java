package subseqence_subset_string_questions.practice;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // method to print the permutations
//        permute("", "abc");

        // method to return an arraylist containing all permutations
//        ArrayList<String> main_list = new ArrayList<>();
//        System.out.println(permute2("", "abc", main_list));

        // third method
        System.out.println(permute3("", "abc"));

        // method to count the number of permutations
        System.out.println(countPermutations("", "abc"));
    }

    private static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            permute( first+ ch + second, up.substring(1));
        }

    }

    // method returns only first permutations then exits
    //    static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<String> permute2(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            return permute2(f + ch + s, up.substring(1), list);
        }

        return list;
    }

    private static ArrayList<String> permute3(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permute3(f + ch + s, up.substring(1)));
        }

       return ans;
    }

    // method to count the number of permutations
    private static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count + countPermutations(f + ch + s, up.substring(1));
        }

        return count;
    }
}
