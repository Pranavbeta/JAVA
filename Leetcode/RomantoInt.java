package Leetcode;
import java.util.*;
class RomantoInt {
    public static int value(char r){
        if('I'==r){
            return 1;
        }
        if('V'==r){
            return 5;
        }
        if('X'==r){
            return 10;
        }
        if('L'==r){
            return 50;
        }
        if('C'==r){
            return  100;
        }
        if(r=='D'){
            return 500;
        }
        if(r=='M'){
            return 1000;
        }
        return -1;
    }
    public static int RomantoInt(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            int s1=value(s.charAt(i));
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
                if(s1>=s2){
                    ans=ans+s1;
                }
                else{
                    ans=ans+s2-s1;
                    i++;
                }
            }
            else{
                ans=ans+s1;
            }    
            }
        return ans;
    }
public static void main(String[] args) {
    String s= "III";
    System.out.println(RomantoInt(s));
}    
}

