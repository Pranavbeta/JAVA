package Array;

public class Max_Subarray {
    public static void Sub_array(int number[]){
        int max=Integer.MIN_VALUE;
        int curr_sum=0;
        int prefix[]=new int[number.length];
        //calculating prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        } 
        for(int i=0;i<number.length-1;i++){
            int Start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                curr_sum=Start==0 ?prefix[end]:prefix[end]-prefix[Start-1];
                //brute force approach
               /*  for(int k=Start;k<=end;k++){
                    curr_sum+=number[k];
                    System.out.println(curr_sum);
                }*/
                if(max<curr_sum){
                    max=curr_sum;
                }
            }
        }
        System.out.println("max sum"+" "+max);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        Sub_array(number);
    }
}
