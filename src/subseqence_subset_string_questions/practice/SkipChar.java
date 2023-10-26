/*I coded myself*/

package subseqence_subset_string_questions.practice;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skipChar("", "aparajita"));
        skipChar2("", "aparajita");
    }

    public static String skipChar(String p, String up) {
        // base-case
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipChar(p, up.substring(1));
        } else {
            return skipChar(p + ch, up.substring(1));
        }
    }

    public static void skipChar2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skipChar2(p, up.substring(1));
        } else {
            skipChar2(p + ch, up.substring(1));
        }
    }
}
