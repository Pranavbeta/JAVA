package stack;
import java.util.*;
public class nextgreater {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextgreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i]=arr[s.peek()];
            }
            //push
            s.push(i);
        }
        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}
