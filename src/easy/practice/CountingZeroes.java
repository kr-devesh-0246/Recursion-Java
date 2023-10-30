package easy.practice;

public class CountingZeroes {
    public static void main(String[] args) {
        int n = 10203040;
        System.out.println(countZeroes(n));
    }

    static int countZeroes(int n) {
        return helper(n, 0); // count is initially zero
    }

    static int helper(int n, int count) {
        // base-case
        if (n == 0) {
            return count;
        }

        // body
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
}
