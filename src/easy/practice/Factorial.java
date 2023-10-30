package easy.practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(facto(7)); // 5040
    }

    static int facto(int n) {
        // base-case
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * facto(n-1);
    }
}

