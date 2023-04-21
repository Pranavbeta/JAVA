public class searchtarget {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int Target=0;
        int taridx=search(arr, Target,0,arr.length-1);
        System.out.println(taridx);
    }
    public static int search(int arr[],int tar,int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){//l1
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si,mid-1);//left
            }
            else{
                return search(arr, tar,mid+1,ei);//right
            }
        }
        else{//l2
            if(arr[mid]<=tar&& tar<=arr[ei]){
                return search(arr, tar,mid+1, ei);//right
            }
            else{
                return search(arr, tar,si,mid-1);//left
            }
        }
    }
}
