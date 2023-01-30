package Backtracking;

import java.util.*;

public class mkjumps {
    static int[] r = { 2, 2, 1, 1, -1, -1, -2, -2 };
    static int[] c = { 1, -1, 2, -2, 2, -2, 1, -1 };
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        int ones = 0;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = sc.nextInt();
                if (maze[i][j] == 1) {
                    ones++;
                }
            }
        }
        int[][] ans = new int[n][n];
        Solve(maze, ans, 0, 0, 0);
        System.out.println(ones - max);
        sc.close();
    }

    private static void Solve(int[][] maze, int[][] ans, int i, int j, int count) {

        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0) {
            return;
        }
        maze[i][j] = 0;
        count++;
        max = Math.max(max, count);
        for (int k = 0; k < 8; k++) {
            Solve(maze, ans, i + r[k], j + c[k], count);
        }
        maze[i][j] = 1;
    }

}
