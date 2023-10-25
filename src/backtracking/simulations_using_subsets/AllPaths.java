/*STACK-Overflow ERROR*/

package backtracking.simulations_using_subsets;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        allPaths("", board, 0, 0);
    }

    static void allPaths(String p, boolean[][] maze, int r, int c) {
        // base-case gets soft-coded with maze dimensions
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // Down movement
        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }

        // Right movement
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }

        // Up movement
        if (r > 0) {
            allPaths(p + 'D', maze, r -1, c);
        }

        // Left movement
        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }
    }
}
