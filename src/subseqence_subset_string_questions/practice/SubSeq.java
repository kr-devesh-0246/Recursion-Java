package subseqence_subset_string_questions.practice;

import java.util.ArrayList;
public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
        ArrayList<String> result = subseq2("", "abc");
        System.out.println(result);
    }

    private static void subseq(String p, String up) {
        // base-case
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    private static ArrayList<String> subseq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p + ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
