package easy.practice;

public class ReverseNum {
    public static void main(String[] args) {
        reverseNum(4321);
        System.out.println(rev);
    }

    static int rev = 0;
    static int rem = 0;
    static void reverseNum(int n) {
        // base-case
        if (n == 0) {
            return;
        }

        rem = n % 10;
        rev = rev * 10 + rem;
        reverseNum(n / 10);
    }
}
