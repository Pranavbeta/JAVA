package Sorting;

public class Counting {
    public static void Counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        //frequency count
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int  j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,8,2,1};
        Counting_sort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
