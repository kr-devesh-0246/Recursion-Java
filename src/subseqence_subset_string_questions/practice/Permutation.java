package subseqence_subset_string_questions.practice;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        permute("", s);
    }

    public static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int n = p.length();
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permute(f + ch + s, up.substring(1));
        }
    }
}
