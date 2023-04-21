package Backtracking;

public class grid{
    public static int Gridways(int i,int j,int m,int n){
        //base case
        if(i==n-1 && j==m-1){//condition for  last  cell
            return 1;
        }
        else{
            if(i==n||j==m){//cond.for boundary 
                return 0;
            }
        }
        int w1=Gridways(i+1, j, m, n);//down
        int w2=Gridways(i, j+1, m, n);//right 
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3; 
        int m=3;
        System.out.println(Gridways(0, 0, m, n));
    }
}