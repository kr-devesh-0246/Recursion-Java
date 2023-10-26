package backtracking.practice;

import com.sun.jdi.event.StepEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazePractice {
    public static void main(String[] args) {
//        System.out.println(countPaths(3, 3));
//        System.out.println(countPathsKK(3, 3));
//        printPaths("", 3, 3);
        System.out.println(printPaths2("", 3, 3));
    }

    public static int countPaths(int r, int c) {
        // If you reach the last row/col. It is certain to reach the target.
        // Thus, you increment the count of path by 1
        if (r == 1 || c == 1) {
            return 1;
        }
        int count = 0;

        count = count + countPaths(r-1, c);
        count = count + countPaths(r, c-1);

        // Below code is less optimised
       /* if (r > 1) {
            count = count + countPaths(r-1, c);
        }

        if (c > 1) {
            count = count + countPaths(r, c-1);
        }*/

        return count;
    }

    /*Kunal Kushwaha solved it using below method*/
    public static int countPathsKK(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countPathsKK(r-1, c);
        int right = countPathsKK(r, c-1);

        return left + right;
    }

    // Learn why StackOverflow is occuring
    /*public static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        printPaths(p + 'D', r - 1, c);
        printPaths(p + 'R', r, c - 1);
    }*/












    // ****************************************************//
    // ********************VERY IMPORTANT*****************//
    // ****************************************************//

    // Though process: Whenever you need to print the path or whatever(String or answers) you use the processed and up thing
    public static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        // the recursive calls were stack overflowing because they were called even when only r == 1.
        // Thus, call only if (r > 1) or (c > 1)
        if (r > 1) {
            printPaths(p + 'D', r - 1, c);
        }
        if (c > 1) {
            printPaths(p + 'R', r, c - 1);
        }
    }

    // Do the same thing but return an arraylist
    public static ArrayList<String> printPaths2(String p, int r, int c) {
        ArrayList<String> outer = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        if (r > 1) {
            outer.addAll(printPaths2(p + 'D', r-1, c));
        }
        if (c > 1) {
            outer.addAll(printPaths2(p + 'R', r, c-1));
        }

        return outer;
    }
}
