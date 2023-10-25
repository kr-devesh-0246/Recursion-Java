/* The code is not working */

package easy;

public class Reverse {
    public static void main(String[] args) {
        int rev = reverseNum(1235);
        System.out.println(rev);
    }

    static int base = 1;
    public static int reverseNum(int n) {
        // Base condition
        if(n == 0) {
            return 0;
        }

        return (n%10)*(base*=10) + reverseNum(n/10);
    }
}
