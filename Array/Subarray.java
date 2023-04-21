package Array;

public class Subarray {
    public static void Sub_array(int number[]){
        for(int i=0;i<number.length-1;i++){
            int Start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=Start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        Sub_array(number);
    }
}
