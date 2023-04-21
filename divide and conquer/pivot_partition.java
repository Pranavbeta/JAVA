public class pivot_partition {
    public static void main(String[] args) {
        int arr[]={8,7,6,3,5,4,9};
        quicksort(arr, 0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
public static void quicksort(int[] arr,int si,int ei) {
    if(si>=ei){
        return;
    }
    int pidx=partition(arr, si, ei);
    quicksort(arr, si,pidx-1);
    quicksort(arr,pidx+1, ei);

}
public static int partition(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            //swap
            int temp=arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
        }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
}

}
