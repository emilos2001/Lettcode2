package LeetCode.Medium;

import java.util.HashSet;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int rows : row){
            for (int i = 0; i < matrix[0].length; i++){
                matrix[rows][i] = 0;
            }
        }
        for (int cols : col){
            for (int i = 0; i < matrix.length; i++){
                matrix[i][cols] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }
}
