package queue;
import java.util.*;
public class Interleave {
    public static void inter_leave(Queue<Integer>q){
        Queue<Integer>firstq=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firstq.add((q.remove()));
        }
        while(!firstq.isEmpty()){
            q.add(firstq.remove());
            q.add(q.remove());
        }
    } 
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        inter_leave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
