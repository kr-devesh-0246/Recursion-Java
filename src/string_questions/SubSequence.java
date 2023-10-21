package string_questions;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        subseq("", "abc");

        ArrayList<String> res = subseq2("", "abc");
        System.out.println(res);

        // printing with their ascii
        subseqAscii("", "abc");

        // storing ascii into an arraylist
        ArrayList<String> res2 = subseqAscii2("", "abc");
        System.out.println(res2);
    }

    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    /*Brush up Arrays problems before this. Try to understand when Argument was defined inside the method*/
    public static ArrayList<String> subseq2(String p, String up) {
//        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            // refer to 7th problem in arrays questions
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

    public static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        System.out.println(ch + 0);

    }

    public static ArrayList<String> subseqAscii2(String p, String up) {
//        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            // refer to 7th problem in arrays questions
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqAscii2(p + ch, up.substring(1));
        ArrayList<String> second = subseqAscii2(p, up.substring(1));
        ArrayList<String> third = subseqAscii2(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
