package stack;
import java.util.*;
public class stockspan {
    public static void Stockspan(int stocks[],int span[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(1);
        for(int i=0;i<stocks.length;i++){
            int currprice=stocks[i];
            while(!s.isEmpty() && currprice >stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        Stockspan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
