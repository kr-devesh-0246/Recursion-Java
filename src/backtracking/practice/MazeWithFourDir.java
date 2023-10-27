package backtracking.practice;

import java.util.ArrayList;

public class MazeWithFourDir {
    public static void main(String[] args) {

    }

    public static ArrayList<String> printPaths(String p, int r, int c) {
        ArrayList<String> outer = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        if (r > 1) {
            outer.addAll(printPaths(p + 'H', r-1, c));
        }
        if (c > 1) {
            outer.addAll(printPaths(p + 'V', r, c-1));
        }


        return outer;
    }
}
