/* I Coded it myself successfully*/

package subseqence_subset_string_questions.practice;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        permute("", s);

        System.out.println(permute2("", s));

        System.out.println(countPermutation("", s));
    }

    public static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permute(f + ch + s, up.substring(1));
        }
    }

    // Try to return it inside an ArrayList
    public static ArrayList<String> permute2(String p, String up) {
        ArrayList<String> outer = new ArrayList<>();
        if (up.isEmpty()) {
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            outer.addAll(permute2(f + ch + s, up.substring(1)));
        }

        return outer;
    }

    public static int countPermutation(String p, String up) {
        int count = 0;
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = count + countPermutation(f + ch + s, up.substring(1));
        }

        return count;
    }
}
