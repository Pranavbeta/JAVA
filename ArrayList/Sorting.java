package ArrayList;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);
    }
    
}
