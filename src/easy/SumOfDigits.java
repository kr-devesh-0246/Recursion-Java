package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(343434));;
    }
    public static int sumOfDigits(int n) {
        //Base condition
        if(n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
