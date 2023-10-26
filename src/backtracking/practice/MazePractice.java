package backtracking.practice;

public class MazePractice {
    public static void main(String[] args) {
        System.out.println(countPaths(3, 3));
        System.out.println(countPathsKK(3, 3));
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
}
