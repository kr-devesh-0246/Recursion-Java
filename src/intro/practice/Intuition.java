package intro.practice;

public class Intuition {
    public static void main(String[] args) {
        // Print it five times

        // 1st approach: call same method five times
       /* message();
        message();
        message();
        message();
        message();*/

        // 2nd approach: Call one method and modify it's body
        /*message();*/

        // Write a function that takes in a number and print first n numbers
//        print1(1); // Doing it intuitively

        print(1); // doing it recursively
    }

    /*private static void message() {
        System.out.println("Hello Devesh");
        message1();
    }
    private static void message1() {
        System.out.println("Hello Devesh");
        message2();
    }
    private static void message2() {
        System.out.println("Hello Devesh");
        message3();
    }
    private static void message3() {
        System.out.println("Hello Devesh");
        message4();
    }
    private static void message4() {
        System.out.println("Hello Devesh");
    }*/

    // Example 2
    /*private static void print1(int n) {
        System.out.println(n);
        print2(n + 1);
    }
    private static void print2(int n) {
        System.out.println(n);
        print3(n + 1);
    }
    private static void print3(int n) {
        System.out.println(n);
        print4(n + 1);
    }
    private static void print4(int n) {
        System.out.println(n);
        print5(n + 1);
    }
    private static void print5(int n) {
        System.out.println(n);
    }*/

    // implementing recursive approach
    private static void print(int n) {
        // base-case
        if (n == 5) {
            System.out.println(n);
            // you need to stop the further recursion calls
            return;
        }

        // recursive call
        System.out.println(n);
        print(n + 1);
    }
}
