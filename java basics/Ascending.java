public class Ascending {
    public static void main(String args[])
    {
    int arr[]={3,5,36,7,8,13,25,24,1,695},temp=0;
    System.out.println("Elements of original array: ");
    for (int i = 0; i < arr.length; i++)
    {
    System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < arr.length; i++)
    {
    for (int j = i+1; j < arr.length; j++)
    {
    if(arr[i] > arr[j])
    {
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    }
    }
    System.out.println();
   
    System.out.println("Elements of array sorted in ascending order: ");
    for (int i = 0; i < arr.length; i++)
    {
    System.out.print(arr[i] + " ");
    }
    }
   } 
   