package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return (monoHorizontal(board) || monoVertical(board));
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] != 1) {
                    result = false;
                    break;
                } else if (cell == board[row].length - 1) {
                    return true;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[cell][row] != 1) {
                    result = false;
                    break;
                } else if (cell == board[row].length - 1) {
                    return true;
                }
            }
        }
        return result;
    }
}
