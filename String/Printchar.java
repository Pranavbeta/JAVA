public class Printchar {
    public static void Print_char(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String name="racecar";
        Print_char(name);
    }
}
