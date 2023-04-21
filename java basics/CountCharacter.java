public class CountCharacter
{
 public static void main(String[] args)
{
 String string = "I am Pranav Upadhyay.";
 int count = 0;


 for(int i = 0; i < string.length(); i++)
{
 if(string.charAt(i) != ' ')
 count++;
}


 System.out.println("Total number of characters in a string: " + count);
}
} 