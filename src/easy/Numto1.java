package easy;

public class Numto1 {
    public static void main(String args[]) {
        // write a recursive function which prints all numbers upto 0
        Nto1(5);
        System.out.println("Doing it's reverse");
        Nto1Rev(5);
    }
    public static void Nto1(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }
    public static void Nto1Rev(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        Nto1Rev(n-1);
        System.out.println(n);
    }
}
