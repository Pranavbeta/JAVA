package stack;
import java.util.*;
public class histogram {
    public static int Max_area(int arr[]){
        int maxarea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //next smaller right
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            s.push(i);
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(i);
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //curr area
        int  currarea=0;
        for(int i=0;i<arr.length;i++){
            currarea=arr[i]*(nsr[i]-nsl[i]-1);     
            maxarea=Math.max(currarea,maxarea);   
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={9,0};
        System.out.println(Max_area(arr));
    }
}
