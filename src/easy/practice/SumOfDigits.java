/* Coded myself. Readability is better but took more function parameters than KK*/
package easy.practice;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println(sumOfDigits(1234, sum));
        System.out.println(sumOfDigitsKK(1234));
    }

    static int sumOfDigits(int n, int sum) {
        // base-case
        if (n == 0) {
            sum += n;
            return sum;
        }

        int digit = n % 10;
        sum += digit;
        return sumOfDigits(n / 10, sum);
    }

    // Approach of Kunal Kushwaha
    static int sumOfDigitsKK(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigitsKK(n / 10); // order of this function call does not matter.
    }
}
