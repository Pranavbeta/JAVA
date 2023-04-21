package Backtracking;

public class permutation {
    public static void Findpermutation(String str,String ans){
        if(str.length()==0){// base case
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //abcd i=c ab+d=abd remove c
            String newstr=str.substring(0, i)+str.substring(i+1); 
            Findpermutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        Findpermutation("abc","");
    }
}

