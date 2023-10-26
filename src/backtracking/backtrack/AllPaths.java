package backtracking.backtrack;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathsPrint("", board, 0, 0, path, 1);
    }

    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        // base-case gets soft-coded with maze dimensions
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        // Down movement
        if (r < maze.length - 1) {
            allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        // Right movement
        if (c < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        // Up movement
        if (r > 0) {
            allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        // Left movement
        if (c > 0) {
            allPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the function gets over
        // so before the function gets removed, also the changes that were made by that function
        maze[r][c] = true;
    }
}
