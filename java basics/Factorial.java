import java.util.Scanner;
public class Factorial {
 public static void main (String args[])
 {
 int n,i,fact=1;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number : ");
 n=sc.nextInt();
 sc.close();
 for(i=1;i<=n;i++)
 {
 fact=fact*i;
 }
 System.out.println("Factorial of "+n+" is "+fact);
 }

}