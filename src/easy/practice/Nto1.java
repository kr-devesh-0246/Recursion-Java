package easy.practice;

public class Nto1 {
    public static void main(String[] args) {
        numberToOne(5);
    }

    static void numberToOne(int n) {
        // base-case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        numberToOne(n - 1);
    }
}
