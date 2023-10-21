package string_questions;

public class SkipCharacter {
    public static void main(String args[]) {
        String s = "baccad";
        System.out.println("Using void returning func");
        skipChar("", s);

        System.out.println("Using String returning func");
        String p = skipChar("baccad");
        System.out.println(p);
    }

    private static void skipChar(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            skipChar(processed, unprocessed.substring(1));
        } else {
            skipChar(processed + ch, unprocessed.substring(1));
        }
    }

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
