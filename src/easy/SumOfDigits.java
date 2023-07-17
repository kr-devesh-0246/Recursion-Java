package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
    public static int sumOfDigits(int n) {
        //Base condition
        if(n == 0) {
            return 0;
        }
        return  sumOfDigits(n/10) + (n%10);
    }
}
