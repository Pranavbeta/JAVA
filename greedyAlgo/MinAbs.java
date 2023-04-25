package greedyAlgo;
import java.util.*;
public class MinAbs {
    public static void main(String[] args) {
        int A[]={1,2,3};//pair up and find minimun diffrence sum
        int B[]={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int mindiffrence=0;
        for(int i=0;i<A.length;i++){
            mindiffrence+=Math.abs(A[i]-B[i]);
        }
        System.out.println(mindiffrence);
    }
}
