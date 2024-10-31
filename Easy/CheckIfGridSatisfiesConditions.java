package LeetCode.Easy;

public class CheckIfGridSatisfiesConditions {
    public static boolean checkIfGridSatisfiesConditions(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < cols - 1 && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
                if (i < rows - 1 && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[][] grid = {{1, 0, 2}, {1, 0, 2}};
        boolean res = checkIfGridSatisfiesConditions(grid);
        System.out.println(res);
    }
}
