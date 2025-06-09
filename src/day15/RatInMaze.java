package day15;

import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maze size n: ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];

        System.out.println("Enter maze row-wise (0 or 1):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                maze[i][j] = sc.nextInt();

        List<String> paths = new RatInMaze().findPath(maze, n);
        if (paths.isEmpty()) {
            System.out.println("No path found.");
        } else {
            System.out.println("Paths:");
            for (String path : paths)
                System.out.println(path);
        }
    }

    public List<String> findPath(int[][] maze, int n) {
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1)
            solve(0, 0, "", maze, visited, paths, n);
        return paths;
    }

    private void solve(int x, int y, String path, int[][] maze, boolean[][] visited, List<String> paths, int n) {
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        String dir = "DLRU";
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i], newY = y + dy[i];
            if (isSafe(newX, newY, maze, visited, n)) {
                visited[x][y] = true;
                solve(newX, newY, path + dir.charAt(i), maze, visited, paths, n);
                visited[x][y] = false;
            }
        }
    }

    private boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
        return x >= 0 && y >= 0 && x < n && y < n &&
               maze[x][y] == 1 && !visited[x][y];
    }
}
