package ArrayList;

import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        //operation
        //add elements
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);//o(1)
        list.add(8);

        //list.add(1,9);//o(n)

        System.out.println(list.size());
        //for(int i=list.size()-1;i>=0;i--){
            //System.out.print(list.get(i)+" ");//reverse
        //}

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.print(max);
        //get elements
        //int element=list.get(2);
        //System.out.println(element);
        
        //Remove opration
        //list.remove(2);
        //System.out.println(list);

        //Set  elements
        //list.set(2, 6);
        //System.out.println(list);

        //contains
        //System.out.println(list.contains(2));
        //System.out.println(list.contains(8));
    }
}