package stack;

import java.util.*;

public class stackQ {
    public static void pushAtbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return  result.toString();
    }
    public static void  reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reversestack(s);
        pushAtbottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversestack(s);
        printStack(s);
    }
}
