import java.util.*;

public class Solution {
    public static void main(String args[]){
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        l.add(80);
        System.out.println(l);

        // for(int i : l){
        //   if(i==40){ 
        //     continue;
        //   }
        //   System.out.println(i);
        // }
        Iterator<Integer> v = l.iterator();
        while(v.hasNext()){
            Integer i =v.next();
            if(i==40){
                continue;
            }
            System.out.println(i);
        }
        Random r= new Random();
        int x=r.nextInt();
        System.out.println(x);
    }
}
