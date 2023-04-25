package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
    public static void main(String[]args){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i]; 
        }
        //sort into Acsending order
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity=w;
        int finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--){//decending order mai chahiye
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalvalue+=value[idx];
                capacity-=weight[idx];
            }
            else{
                finalvalue+=(ratio[i][1]*capacity);
                capacity=0;
            }
        }
        System.out.println("finalvalue = "+finalvalue);
    }
}
