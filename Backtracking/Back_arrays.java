package Backtracking;

class Back_arrays{
    public static void changevalue(int arr[],int i,int value){
        //base case
        if(i==arr.length){
            Print(arr);
            return;
        }
        //kaam
        arr[i]=value;
        changevalue(arr, i+1, value+1);
        arr[i]=arr[i]-2;
    }
    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    } 
     public static void main(String[] args) {
        int arr[]= new int[5];
        changevalue(arr, 0, 1);
        Print(arr);
    }

}