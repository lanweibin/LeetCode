package dfs.easy;

//Max Area of Island
public class MaxIsland {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int[][] vissted = new int[grid.length][grid[0].length];
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }
                int result = find(grid, i, j, vissted);
                if (max < result) {
                    max = result;
                }

            }

        }

        return max;
    }


    private int find(int[][] grid, int x, int y, int[][] visited) {
        if (grid[x][y] == 0 || visited[x][y] == 1) {
            return 0;
        }

        int result = 1;
        visited[x][y] = 1;

        if (x + 1 < grid.length) {
            result += find(grid, x + 1, y, visited);
        }

        if (x - 1 >= 0) {
            result += find(grid, x - 1, y, visited);
        }


        if (y + 1 < grid[0].length) {
            result += find(grid, x, y + 1, visited);
        }

        if (y - 1 >= 0) {
            result += find(grid, x, y - 1, visited);
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};



    }

}

