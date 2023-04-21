package Array_2D;

public class Sorted {
    public static boolean find_key(int matrix[][],int key){
        int row=0 ,col=matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==key){
                System.out.print("found key at("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("key not found");//0(n+m)
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        find_key(matrix, key);
    }
}
