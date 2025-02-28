package LeetCode.Hard;

public class SudokuSolver {
    public static void sudokuSolver(char[][] board) {
        System.out.println(solved(board));
    }

    static boolean solved(char[][] board){
        for (int i = 0; i <  9; i++){
            for(int j = 0; j < 9; j++){
                if (board[i][j] == '.'){
                    for (char num = '1'; num <= '9'; num++){
                        if (isValid(board,i, j, num)){
                            board[i][j] = num;
                            if(solved(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
            if (board[i][col] == num) {
                return false;
            }
            int boxRow = (row / 3) * 3 + i/ 3;
            int boxCol = (col / 3) * 3 + i % 3;
            if (board[boxRow][boxCol] == num){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        sudokuSolver(board);
    }
}
