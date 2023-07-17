/*Cheating*/
package easy;


public class ReverseNumber {
    static int sum = 0;
    static int rem = 0;
    public static void rev1(int n) {
        if(n == 0) {
            return;
        }
        rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }
    public static int rev2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    /*
     *It is a method that reverses a number taking in the base value and multiplying accordingly
     */
    public static int helper(int n, int digits) {
        // if it is a single digit number return itself
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    public static void main(String args[]) {
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(5678));
    }
}
