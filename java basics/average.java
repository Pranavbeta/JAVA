import java.util.Scanner;
public class average {
 public static void main(String args[])
 {
 int i;
 float n,j=0,k=0,avg;

 System.out.print("Enter value of N :");
 Scanner sc= new Scanner(System.in);
 n = sc.nextInt();
 for(i=1;i<=n;i++)
 {
 System.out.print("Enter number "+i+" :");
 j=sc.nextInt();
 k=k+j;
 }
 avg = k/n;
 System.out.println("Average of given numbers are "+avg);
 }

} 

