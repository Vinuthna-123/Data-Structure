import java.util.Collections;
import java.util.List;

class Unique {

    public static int lonelyinteger(List<Integer> a) {
     for(int i=0;i<a.size();i++){
         if(Collections.frequency(a, a.get(i)) == 1){
             return a.get(i);
         }
         
     }
     return -1;

    }
}
