package stack;
import java.util.*;
public class StackB {
    static class stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static  boolean isempty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static  int pop(){
            if(isempty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isempty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isempty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
