public class Knight {
    public static boolean knightmoves(int board[][], int row, int col, int move) {

    if(move == board.length * board.length - 1) {
        return true;
    }

    int dx[] = {-2, -1, 2, 1, -1, 2, -2, 1};
    int dy[] = {-1, -2, 1, 2, 2, -1, 1, -2};

    for(int i = 0; i < 8; i++) {

        int nextRow = row + dx[i];
        int nextCol = col + dy[i];

        if(nextRow >= 0 && nextRow < board.length &&
           nextCol >= 0 && nextCol < board.length &&
           board[nextRow][nextCol] == -1) {

            board[nextRow][nextCol] = move + 1;

            if(knightmoves(board, nextRow, nextCol, move + 1)) {
                return true;
            }

            board[nextRow][nextCol] = -1;
        }
    }

    return false;
}
public static void printBoard(int board[][]){
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            System.out.print(board[i][j]+" ");
        }
      System.out.println();
    }

}
public static void main(String[] args) {
    int n=6;
    int board[][]=new int[n][n];
    // initialization of board
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            board[i][j]=-1;
        }

    }
board[0][0]=0;


if(knightmoves(board, 0, 0, 0)){
    System.out.println("solution exits");
    printBoard(board);

}else{
    System.out.print("solution does not exits");

}
}


    
}
