package stack;
public class stackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stackb{
        static Node head=null;
        public static boolean isempty(){
            return head==null; 
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isempty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static  int  peek(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            return top;
        }    
    }
    public static void main(String[] args) {
        Stackb st=new Stackb();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isempty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
