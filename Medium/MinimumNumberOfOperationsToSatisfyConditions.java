package LeetCode.Medium;

public class MinimumNumberOfOperationsToSatisfyConditions {
    public static int minimumOperations(int[][] grid) {
        int operations = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] != grid[i][0]) {
                    operations++;
                    grid[i][j] = grid[i][0];
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if(grid[i][j] != grid[0][j]){
                    operations++;
                    grid[i][j] = grid[i][0];
                }
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 0, 2}, {1, 0, 2}};
        System.out.println(minimumOperations(grid));
    }
}
