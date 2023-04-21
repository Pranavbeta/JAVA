package Pattern;

public class pattern {
    public static void floyds_triangle(int n){
        int count=1;
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println( );
        }
    }
    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println( );
        }
    } 
    public static void butterfly(int n){
        //1 half
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner loop
            //star(1 to i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space(1 to 2(n-i))
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star(1 to i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println( );
        }
        //2half
        for(int i=n;i>=1;i--){
            //Inner loop
            //star(1 to i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space(1 to 2(n-i))
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star(1 to i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    } 
    public static void Solid_Rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void Hollow_Rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if (i==1||n==i||j==1||j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
    public static void Dimond(int n){
        //1 half
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j =1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
        //2 half
        //outer loop
        for(int i=n;i>=1;i--){
             //Inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j =1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Dimond(4);
    }
}
