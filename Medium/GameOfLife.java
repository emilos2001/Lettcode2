package LeetCode.Medium;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] temp = new int[row][col];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                temp[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;
                if ((i - 1) >= 0 & (j - 1) >= 0) {
                    sum += temp[i - 1][j - 1];
                }
                if (i - 1 >= 0) {
                    sum += temp[i - 1][j];
                }
                if ((i - 1) >= 0 & (j + 1) < col) {
                    sum += temp[i - 1][j + 1];
                }
                if (j - 1 >= 0) {
                    sum += temp[i][j - 1];
                }
                if (j + 1 < col) {
                    sum += temp[i][j + 1];
                }
                if ((i + 1) < row & (j - 1) >= 0) {
                    sum += temp[i + 1][j - 1];
                }
                if (i + 1 < row) {
                    sum += temp[i + 1][j];
                }
                if ((i + 1) < row & (j + 1) < col) {
                    sum += temp[i + 1][j + 1];
                }
                if (temp[i][j] == 0) {
                    if (sum == 3) {
                        board[i][j] = 1;
                    }
                } else if (temp[i][j] == 1) {
                    if (sum < 2 || sum > 3) {
                        board[i][j] = 0;
                    }
                }

                System.out.print(board[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}};
        gameOfLife(board);
    }
}
