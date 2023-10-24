package subseqence_subset_string_questions;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // void returning method
//        pad("", "12");

        // Arraylist returning method
        System.out.println(pad2("", "12"));

        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // converts '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }

    }

    // method to return an arraylist
    private static ArrayList<String> pad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';


        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad2(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch,  up.substring(1));
        }

        return count;
    }
}
