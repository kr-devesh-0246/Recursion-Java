package easy.practice;

public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(1234)); // 24 as it also factorial
    }

    static int prodOfDigits(int n) {
        // base-case
        if (n == 0) {
            return 1; // multiplying with one does not affect the number
        }

        return prodOfDigits(n/10) * (n % 10);
    }
}
