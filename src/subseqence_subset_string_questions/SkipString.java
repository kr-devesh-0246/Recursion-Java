package subseqence_subset_string_questions;

public class SkipString {
    public static void main(String[] args) {
        System.out.println((skipApple("abcdappleefgh")));
    }

    private static String skipApple(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("apple")) {
            return skipApple(unprocessed.substring("apple".length()));
        } else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}
