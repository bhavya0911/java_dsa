public class NQueens {

    public static boolean oneQueens(char board[][], int row) {
        if(row == board.length) {
            return true;
        }
        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(oneQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static void nQueens(char board[][], int row) {
        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("---Chess board---");
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count = 0;
    public static void main(String args[]) {
        int n = 3;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (oneQueens(board, 0)) {
            System.out.println("Solution possible");
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
    }   
}