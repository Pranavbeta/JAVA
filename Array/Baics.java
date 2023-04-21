package Array;

public class Baics {
    public static void Reverse_Array(int number[]){
        for(int i=number.length-1;i>=0;i--){
            System.out.print(number[i]);
        }
    }
    public static void Pairs(int number[]){
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int  number[]={5,4,3,2,1};
        Pairs(number);
    }
}
