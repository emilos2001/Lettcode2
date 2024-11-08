package LeetCode.Medium;

public class SearchTwoDMatrix {
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int length = rows * cols;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int midIndex = left + (right - left) / 2;
            int midRow = midIndex / cols;
            int midCol = midIndex % cols;
            int midValue = matrix[midRow][midCol];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1},{1}};
        System.out.println(searchInMatrix(matrix, 2));
    }
}
