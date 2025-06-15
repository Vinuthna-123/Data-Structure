//within an array find the min and max value by using an single iteration.

import java.util.ArrayList;

public class Minmax {
    public static void main(String args[]){
        ArrayList <Integer> l = new ArrayList<>();
        l.add(50);
        l.add(10);
        l.add(5);
        l.add(40);
        System.out.println(l);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);
        for(int i=0;i<l.size();i++){
            int pre = l.get(i);
            if(pre<min){
                min=pre;
            }
            if(pre>max){
                max = pre;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
