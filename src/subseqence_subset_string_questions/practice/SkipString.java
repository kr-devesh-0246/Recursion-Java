package subseqence_subset_string_questions.practice;

public class SkipString {
    public static void main(String[] args) {
        String s = "devesheatsanapple";
        System.out.println(skipString(s));
    }

    public static String skipString(String up){
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (up.startsWith("devesh")) {
            return skipString(up.substring("devesh".length()));
        } else {
            return ch + skipString(up.substring(1));
        }
    }
}
