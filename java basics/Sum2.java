public class Sum2 {
    public int sum(int x, int y) { return (x + y); }
   
    public int sum(int x, int y, int z)
    {
    return (x + y + z);
    }
    public double sum(double x, double y)
    {
    return (x + y);
    }
    public static void main(String args[])
    {
    Sum2 s = new Sum2();
    System.out.println("Sum of 10 & 20 is "+s.sum(600, 95));
    System.out.println("Sum of 10, 20 & 30 is "+s.sum(600, 85, 10));
    System.out.println("Sum of 10.5 & 20.5 is "+s.sum(10.5, 20.5));
    }
   
   } 
   