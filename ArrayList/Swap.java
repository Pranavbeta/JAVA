package ArrayList;

import java.util.ArrayList;
import java.util.Set;

public class Swap {
    public static void swap(ArrayList<Integer>list,int Idx1,int Idx2){
        int temp=list.get(Idx1);
        list.set(Idx1,list.get(Idx2));
        list.set(Idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int Idx1=1;
        int Idx2=2;
        System.out.println(list);
        swap(list, Idx1, Idx2);
        System.out.println(list);
    }
}
