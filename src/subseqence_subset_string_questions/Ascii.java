package subseqence_subset_string_questions;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0);

        AsciiOfCharacters();
    }

    public static void AsciiOfCharacters() {
        for (int i = 0; i < 255; i++) {
            System.out.println("The ASCII value of " + (char) i + ": " + (int) i);
        }
    }
}
