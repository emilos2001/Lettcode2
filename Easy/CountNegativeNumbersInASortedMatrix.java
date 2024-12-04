package LeetCode.Easy;

public class CountNegativeNumbersInASortedMatrix {
    public static int maximumNegatives(int[][] grid) {
        int maxNegatives = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    maxNegatives++;
                }
            }
        }
        return maxNegatives;
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -1, -3}};
        System.out.println(maximumNegatives(grid));
    }
}
