package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
    static ArrayList<int[]> validSolutions = new ArrayList<>();

    public static void main(String[] args) {
        int[] board = new int[8];
        generateAllSolutions(board, 0);

        int[] initialPositions = {1, 2, 3, 4, 5, 6, 7, 8};
        int minMoves = findMinMoves(initialPositions);

        System.out.println("Minimum moves required: " + minMoves);
    }

    public static int findMinMoves(int[] initial) {
        int minMoves = Integer.MAX_VALUE;

        for (int[] solution : validSolutions) {
            int currentMoves = 0;
            for (int col = 0; col < 8; col++) {
                if (initial[col] != solution[col]) {
                    currentMoves++;
                }
            }
            minMoves = Math.min(minMoves, currentMoves);
        }

        return minMoves;
    }

    public static void generateAllSolutions(int[] board, int col) {
        if (col == 8) {
            validSolutions.add(Arrays.copyOf(board, 8));
            return;
        }

        for (int row = 1; row <= 8; row++) {
            if (isSafe(board, row, col)) {
                board[col] = row;
                generateAllSolutions(board, col + 1);
            }
        }
    }

    public static boolean isSafe(int[] board, int row, int col) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = board[prevCol];
            if (prevRow == row || Math.abs(prevRow - row) == Math.abs(prevCol - col)) {
                return false;
            }
        }
        return true;
    }
}