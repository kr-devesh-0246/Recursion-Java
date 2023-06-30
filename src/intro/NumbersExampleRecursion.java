package intro;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first five numbers: 1 2 3 4 5
        // instead we do use recursion
        print(1);
    }

    static void print(int n) {
        // base condition
        if(n==5) {
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        print(n+1);
    }
}