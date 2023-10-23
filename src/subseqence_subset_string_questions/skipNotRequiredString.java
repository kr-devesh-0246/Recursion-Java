package subseqence_subset_string_questions;

public class skipNotRequiredString {
    public static void main(String[] args) {
        System.out.printf(skipAppNotApple("abcdeappfghapple"));
    }

    public static String skipAppNotApple(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
            return skipAppNotApple(unprocessed.substring("app".length()));
        } else {
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
