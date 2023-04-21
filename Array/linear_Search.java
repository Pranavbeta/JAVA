package Array;

public class linear_Search {
    public static int Find_Num(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7,8,9};
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
