package Pattern;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[]args){
        int row=4;
        int col=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(1==i||row==i||col==j||1==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }    
}
