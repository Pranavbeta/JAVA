public class basic {
    public static boolean Ispalindrome(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return  false;
            }
        }
        return true;
    }
    public static float GetShortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static String Sub_string(String str,int si,int ei){
        String substring=" ";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
    } 
    public static String largest_String(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        return largest;
    }
    public static String toUpperString(String str){
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String Compress(String str){
        StringBuilder sb=new StringBuilder(" ");
       
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbbbccccd";
        System.out.println(Compress(str));
    }
}
