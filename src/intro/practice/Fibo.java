/*Could not print the fibo series recursively. Try doing it by incrementing the parameters in calls*/

package intro.practice;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo1(10));
        fibo2(10); // not working
    }

    public static int fibo1(int n) {
        // base-case
         if (n < 2) {
             return n;
         }

         return fibo1(n - 1) + fibo1(n - 2);
    }

    public static int fibo2(int n) {
        // base-case
        if (n < 2) {
            System.out.println(n);
            return n;
        }

        // recursive calls
        System.out.println(fibo2(n - 1) + fibo2(n - 2));
        return fibo2(n - 1) + fibo2(n - 2);
    }
}
