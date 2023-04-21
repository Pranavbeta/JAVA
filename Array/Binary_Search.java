package Array;

public class Binary_Search {
    public static int Find_Num(int number[],int key){
        int Start=0;
        int end=number.length-1;
        while (Start<=end) {
            int mid=(Start+end)/2;
            System.out.println(number[mid]);
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                Start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        int key=5;
        int Index=Find_Num(number, key);
        if(Index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("key found at index"+" " +Index);
        }
        System.out.println( );
    }
}
