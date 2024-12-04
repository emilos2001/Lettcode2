package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class CheckifEveryRowAndColumnContainsAllNumbers {
    public static boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] < 1 || matrix[i][j] > matrix.length || !row.add(matrix[i][j])){
                    return false;
                }
                if (matrix[j][i] < 1 || matrix[j][i] > matrix.length || !col.add(matrix[j][i])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        System.out.println(checkValid(matrix));
    }
}
