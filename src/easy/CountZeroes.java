package easy;

public class CountZeroes {
    public static int count(int n) {
        return helper(n, 0);
    }
    // special pattern, how to pass a value to above calls
    // here return c; is hit only once and then it only passing the value
    // to the above calls
    public static int helper(int n, int c) {
        // Base-Case
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
    public static void main(String[] args) {
        System.out.println(count(38000004));
    }
}
