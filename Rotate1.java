import java.util.ArrayList;

public class Rotate1 {

    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        int rev =0;
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        for(int i=0;i<a.size() / 2;i++){
            int n=a.get(i);
            while(n!=0){
            int rem = n % 10;
             rev = rev*10 +rem;
             n = n / 10;
            }
       a.set(i,rev);
       rev =0;
        }
        System.out.println(a);
    }
}
