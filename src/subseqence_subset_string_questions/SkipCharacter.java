package subseqence_subset_string_questions;

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println("Using void returning func");
        skipChar("", s);

        System.out.println("Using String returning func");
        String p = skipChar1("baccad");
        System.out.println(p);
    }

    private static void skipChar(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return ;
        }

        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            skipChar(processed, unprocessed.substring(1));
        } else {
            skipChar(processed + ch, unprocessed.substring(1));
        }
    }

    private static String skipChar1(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return str.charAt(0) == 'a' ? skipChar1(str.substring(1)) : str.charAt(0) + skipChar1(str.substring(1));
    }

    // Throwing exception [StringIndexOutOfBoundException]
    private static String skipChar(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            return skipChar(unprocessed.substring(1));
        } else {
            return ch + skipChar(unprocessed.substring(1));
        }
    }
}
