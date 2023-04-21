package ArrayList;
import  java.util.*;;

public class PairSum1 {
    //Brute Force
   /*  public static boolean pairsum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int  j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    } */
    public static boolean pairsum(ArrayList<Integer>list,int target){ //two pointer approach
        int lp=0;
        int Rp=list.size()-1;
        while (lp!=Rp) {
            if((lp+Rp)==target){
                return true;
            }
            if((lp+Rp)<target){
                lp++;
            }
            else{
                //case 3
                Rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairsum(list, target));
    }
}
