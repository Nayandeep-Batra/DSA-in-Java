//  To Place a queen safely on a particular block, we need to check 3 directions for any other queen attacking it.
//  3 directions are : 
// vertically up, left diagonal up, right diagonal up

// Recurrence Relation
// T(n) = 1 QueenPlace * T(n-1) + isSafe()
// T(n) = n * T(n-1) + isSafe()

public class NQueens {
    public static boolean isSafe(char board[][], int row, int col) { // Tc = O(n!)
        // vertical up
        for(int i = row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][], int row) {
        // base case
        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        // Loop on columns
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X'; // backtracking step
            }
        }
    }
    // public static boolean nQueens(char board[][], int row) { // to check if solution is possible or not and print 1 correct solution
    //     // base case
    //     if(row == board.length) {
    //         printBoard(board);
    //         count++;
    //         return true;
    //     }
    //     // Loop on columns
    //     for(int j=0; j<board.length; j++) {
    //         if(isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row+1)) {
    //                  return true;
    //             }
    //             board[row][j] = 'X'; // backtracking step
    //         }
    //     }
    //      return false;
    // }
    public static void printBoard(char board[][]) {
        System.out.println("----Chess Board----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board [][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.println("Total ways to solve N Queens = " + count);
    }
}

// To count total number of ways in which we can solve N Queens Problems,
// We take a static variable and increase the count when we hit base case

// to check if problem can be solved & print only 1 solution to N Queens problem,
// we wont unplace queen in isSafe() function, but we will directly return ans will print 1 correct board in main function