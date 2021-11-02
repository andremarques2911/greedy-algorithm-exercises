import java.util.Hashtable;

public class NQueensProblem {

    private final int boardSize;
    private final int[][] board;
    public int iterations;

    public NQueensProblem(int boardSize) {
        this.boardSize = boardSize;
        this.board = new int[boardSize][boardSize];
    }

    public Hashtable execute() {
        if (!backtracking(0, boardSize)) {
            System.out.print("Not exists solution!");
            return null;
        }
        print();

        Hashtable<Integer, Integer> queensPosition = new Hashtable<>();

        for (int i = 0; i < boardSize; i++)
            for (int j = 0; j < boardSize; j++)
                if (board[i][j] == 1)
                    queensPosition.put(i, j);
        return queensPosition;
    }

    public boolean backtracking(int column, int nQueens) {
        if (column >= boardSize || nQueens == 0)
            return true;
        for (int i = 0; i < boardSize; i++) {
            if (validadeRegion(i, column)) {
                board[i][column] = 1;
                if (backtracking(column + 1, nQueens - 1))
                    return true;
                board[i][column] = 0;
            }
            iterations++;
        }
        return false;
    }

    public boolean validadeRegion(int line, int column) {
        for (int i = 0; i < column; i++) {
            if (board[line][i] == 1)
                return false;
            iterations++;
        }
        for (int  i = line, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
            iterations++;
        }
        for (int  i = line, j = column; j >= 0 && i < boardSize; i++, j--) {
            if (board[i][j] == 1)
                return false;
            iterations++;
        }
        return true;
    }

    private void print() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

}
