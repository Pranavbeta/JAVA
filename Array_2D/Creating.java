package Array_2D;

import java.util.Scanner;

public class Creating {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int  j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int  j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
