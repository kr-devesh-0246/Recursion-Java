package easy.practice;

public class Nto1Rev {
    public static void main(String[] args) {
        Nto1Rev(5);
    }

    /*Visualise it using Function call-stack and recursive tree*/
    static void Nto1Rev(int n) {
        // base-case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        // recursive calls and body
        Nto1Rev(n - 1); // when is gets returned
        System.out.println(n); // then number gets printed.
    }
}
