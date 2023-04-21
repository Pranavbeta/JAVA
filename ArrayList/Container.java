package ArrayList;
import java.util.*;
public class Container {
    public static int storewater(ArrayList<Integer>height){
       /*  int maxwater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heightW=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currwater=heightW*width;
                maxwater=Math.max(maxwater, currwater);
            }
        }
        return maxwater;*/
        int Lp=0;
        int Rp=height.size()-1;
        int maxwater=0;
        while (Lp<Rp) {
            int heightW=Math.min(height.get(Lp),height.get(Rp));
            int width=Rp-Lp;
            int currwater=heightW*width;
            maxwater=Math.max(maxwater, currwater);
            if(Lp<Rp){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return maxwater;//o(n)

    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
    
}
