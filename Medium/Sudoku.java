package LeetCode.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for (int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j< 9; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                char value = board[i][j];
                int boxIndex =(i / 3) * 3 + (j / 3);
                if (rows[i].contains(value) || cols[i].contains(value) || box[boxIndex].contains(value)){
                    return false;
                }
                rows[i].add(value);
                cols[j].add(value);
                box[boxIndex].add(value);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] s = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        Sudoku sudoku = new Sudoku();
        System.out.println(sudoku.isValidSudoku(s));
    }
}
