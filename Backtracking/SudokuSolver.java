package Backtracking;

public class SudokuSolver {
    public static boolean IsSafe(int sudoku[][],int row,int col,int digit){
        //row
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //col
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int SR=(row/3)*3;
        int SC=(col/3)*3;
        for(int i=SR;i<SR+3;i++){
            for(int j=SC;j<SC+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
    return true;
    }
    public static boolean Sudokusolver(int sudoku[][],int row,int  col) {
        //base case
        if(row==9){
            return true;
        }
        //resusion function
        int nextrow =row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return Sudokusolver(sudoku, nextrow, nextcol);
        }
        for(int digit=0;digit<=9;digit++){
            if(IsSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(Sudokusolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
        }
    }
    return false;
}
public static void PrintSudoku(int sudoku[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println( );
    }
}
public static void main(String[] args) {
    int sudoku[][]={{0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},
{0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},
{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
if(Sudokusolver(sudoku, 0, 0)){
    System.out.println("Solution exists");
    PrintSudoku(sudoku);
}else{
    System.out.println("Solution doesn't exists");
}
}
}
