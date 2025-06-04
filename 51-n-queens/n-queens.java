public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        int[] queens = new int[n];
        backtrack(0, n, queens, results);
        return results;
    }

    private void backtrack(int col, int n, int[] queens, List<List<String>> results) {
        if (col == n) {
            results.add(generateBoard(queens, n));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isValid(queens, col, row)) {
                queens[col] = row;
                backtrack(col + 1, n, queens, results);
            }
        }
    }

    private boolean isValid(int[] queens, int col, int row) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = queens[prevCol];
            if (prevRow == row || Math.abs(prevRow - row) == Math.abs(prevCol - col)) {
                return false;
            }
        }
        return true;
    }

    private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int row : queens) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < n; col++) {
                sb.append(col == row ? 'Q' : '.');
            }
            board.add(sb.toString());
        }
        return board;
    }
}
