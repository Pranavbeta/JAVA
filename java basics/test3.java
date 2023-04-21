public class test3{
    public static void main(String args[])
    {
    System.out.println("6");
    System.out.println("9");
    System.out.println("5");
    try{
    System.out.println(100/0);
    }
    catch(ArithmeticException e)
    {System.out.println("Arithmatic exception is found");}
    System.out.println("6");
    System.out.println("9");
    int ar[] = { 0, 0, 6,9 , 5 };
    try {
     for (int i = 0; i <= ar.length; i++)
     System.out.print(ar[i]+" ");
    }
    catch (ArrayIndexOutOfBoundsException e) {
     System.out.println("\nArrayOutOf Bounds Exception caught");
    }
    
    }
    } 
    