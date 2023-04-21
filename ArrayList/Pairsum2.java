package ArrayList;
import java.util.*;
public class Pairsum2 {
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int n=list.size();
        /*int i=0;
        while (list.get(i)<list.get(i+1)) {
            i++;
            }
        int Rp =i;
        int lp=i+1;*/
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        } 
        int lp=bp+1;
        int Rp=bp;
        while (lp!=Rp) {
            if((list.get(lp)+list.get(Rp))==target){
                return true;
            }
            if((list.get(lp)+list.get(Rp))<target){
                lp=(lp+1)%n;
            }
            else{
                //case 3
                Rp=(n+Rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        int target=160;
        System.out.println(pairsum(list, target));
}
}
