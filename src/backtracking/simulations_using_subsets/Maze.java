package backtracking.simulations_using_subsets;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // returns the number of paths
        System.out.println(countPaths(3, 3));

        // prints the paths
        path("",  3, 3);

        //returns the paths in arraylist
        System.out.println(pathRet("", 3, 3));

        // returns the paths with diagonal movements in arraylist
        System.out.println(pathRetDiagonal("", 3, 3));

    }
    static int countPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countPaths(r-1, c);
        int right = countPaths(r, c-1);

        return left + right;
    }

    // method to print the path
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r-1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // local list
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c-1));
        }

        return list;
    }

    // Now we can move along the diagonal too.
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // local list
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }
        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }

        return list;
    }


}