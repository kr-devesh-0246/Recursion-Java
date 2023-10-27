package backtracking.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroBacktracking {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
//        allPaths("", board, 0, 0);
        // Steps must start with one as 0 will be overlapped by 0 itself
        printPathMatrix("", board, 0, 0, path, 1);
    }

    // function call in main will be with (r,c) => (0,0)
    public static void allPaths(String p, boolean[][] maze, int r, int c ) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // To avoid stack-overflow error. mark the cells as false on landing
        // this alone would not be sufficient. it doesn't marks back the cell to be true.
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true; // Run with and without this line and note it in notes
    }

    public static void printPathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for (int[] a:  path) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();

            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if (r < maze.length - 1) {
            printPathMatrix(p + 'D', maze, r + 1, c, path, steps + 1);
        }
        if (c < maze[0].length - 1) {
            printPathMatrix(p + 'R', maze, r, c + 1, path, steps + 1);
        }
        if (r > 0) {
            printPathMatrix(p + 'U', maze, r - 1, c, path, steps + 1);
        }
        if (c > 0) {
            printPathMatrix(p + 'L', maze, r, c - 1, path, steps + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true; // Run with and without this line and note it in notes
        path[r][c] = 0;
    }

}