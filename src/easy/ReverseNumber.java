/*Cheating*/
package easy;


public class ReverseNumber {
    static int sum = 0;
    static int rem = 0;
    public static void reverseNum(int n) {
        if(n == 0) {
            return;
        }
        rem = n%10;
        sum = sum*10 + rem;
        reverseNum(n/10);
    }
    public static void main(String args[]) {
        reverseNum(1234);
        System.out.println(sum);
    }
}
