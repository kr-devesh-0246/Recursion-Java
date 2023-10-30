package easy.practice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abdba";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        // base-case
        if (s.length() <= 1) {
            return true;
        }

        char head = s.charAt(0);
        char tail = s.charAt(s.length() - 1);

        if (head == tail) {
            String middle = s.substring(1, s.length() - 1);
            return isPalindrome(middle);
        } else {
            return false;
        }
    }
}
