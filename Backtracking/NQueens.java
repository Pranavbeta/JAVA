package Backtracking;
public class NQueens{
public static boolean IsSafe(char board[][],int col,int row){
    //vertical up
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    //diagonally left
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    //diagonally right
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
public static void nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            Printboard(board);
            return;
        }
        //column kaam
        for(int j=0;j<board.length;j++){
            if(IsSafe(board, j, row)){
            board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='x';
        }
    }
}
    public static void Printboard(char board[][]){
        System.out.println("------------chess board--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
   public static void main(String[] args){
    int n=6;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           board[i][j]='x';
        }
    }
    nQueens(board,0);
   } 
}
