class shape
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Overload //exp14
{
     public static void main(String args[]) 
	{
	   shape sb = new shape();
	   sb.area(5);
	   sb.area(11,12);
	   sb.area(2.5);
       System.out.println("by pranav upadhyay");
        }
       
}