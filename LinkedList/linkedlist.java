package LinkedList;

public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
public void addfirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
//add last
public void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}  
public void Print(){
    if(head==null){
        System.out.print("linked list is empty");
        return;
    }
    System.out.println();
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data +"-> ");
        temp=temp.next;
    }
    System.out.println("null");
}    
public void addMiddle(int idx,int data){
    Node newNode=new Node(data);
    size++;
    if(idx==0){
        addfirst(data);
        return;
    }
    Node temp=head;
    int  i=0;
    while (i<idx-1) {
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}
public int  Removefirst(){
    if(size==0){
        System.out.print("linked list is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}
public int RemoveLast(){
    if(size==0){
        System.out.print("linked list is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node temp=head;
    for(int i=0;i<size-2;i++){
        temp=temp.next;
    }
    int val=temp.next.data;
    temp.next=null;
    tail=temp;
    size--;
    return val;
}
public int itrll(int key){
    Node temp=head;
    int  i=0;
    /*for(int i=0;i<size;i++){
        if(temp.data==key){
            return i;
        }else{
            temp=temp.next;
        }
    }*/
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
}
public int helper(Node head,int key){
    if(head==null){
        return-1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recsearch(int key){
    return helper(head,key);
}
public void reversell(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}
public void DeletefromEnd(int n){
    int sz=0;
    Node temp=head;
    while (temp!=null) {
         temp=temp.next;
         sz++;        
    }
    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int itoprev=sz-n;
    Node prev=head;
    while(i<itoprev){
        prev=prev.next;
        i++;
    }
     prev.next=prev.next.next;
     return;
}
public Node findmid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
public boolean checkpalindrome(){
    if(head==null||head.next==null){
        return true;
    }
    //find mid
    Node mid=findmid(head);
    //reverse  right half
    Node prev=null;
    Node curr=mid;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    //check left & right half
    Node right=prev;
    Node left =head;
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    } 
    return true;
}
public static boolean iscycle(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next;
        if(slow==fast){
            return true;//cycle exists
        }
    }
    return false;
}
public static void removecycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break;
        }
    }
    if(cycle==false){
        return;
    }
    //find last node
    slow=head;
    Node prev=null;
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
    //remove cycle
    prev.next=null;
}
    private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }   
    private Node merge(Node head1 ,Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next; 
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;   
    } 
    public Node mergesort(Node head){
    //base case
    if(head==null || head.next==null ){
        return head;
    }
    //find mid
    Node mid=getmid(head);
    //left & right ms
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright=mergesort(righthead);
    //merge
    return merge(newleft,newright);
}
public void zigzag(){
    //mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //reverse 2 half
    Node  curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node Right=prev;
    Node nextL,nextR;
    //alt merge
    while(left!=null && Right!=null){
        nextL=left.next;
        left.next=Right;
        nextR=Right.next;
        Right.next=nextL;    
        left=nextL;
        Right=nextR;
    }
}
public static void main(String[] args) {
      linkedlist ll=new linkedlist();
      ll.addlast(1);
      ll.addlast(2);
      ll.addlast(3);
      ll.addlast(4);
      ll.addlast(5);
      //ll.addfirst(5);
      ll.Print(); 
      ll.zigzag();
      ll.Print(); 
    }
}
