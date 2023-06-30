package easy;

public class Nto1Reverse {
    public static void main(String[] args) {
        Nto1Rev(5);
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
