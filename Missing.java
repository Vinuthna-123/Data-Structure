import java.util.ArrayList;
import java.util.Scanner;
public class Missing {
    public static int miss(ArrayList<Integer> a){
        //  for(int i=0;i<a.size();i++){
        //     for(int j=i+1;j<a.size();j++){
        //         if(a.get(i)>a.get(j)){
        //             int temp = a.get(i);
        //            a.set(a.get(i),a.get(j));
        //            a.set(a.get(j),temp);
        //         }
        //     }
        //     System.out.println(a);
        // }
        // Integer aa=0;
        Integer missing=0;
        for( int i=0;i<a.size()-1;i++){
            Integer aa=a.get(i);
            Integer ab =a.get(i+1);
            if(ab!=(aa+1)){
                missing=aa+1;
                break;
            }
        }
        return missing;
    }
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = in.nextInt();
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++){
            int ar = in.nextInt();
            a.add(ar);
        }
        Integer res = Missing.miss(a);
        System.out.println("the missing number is :"+res);
       in.close();
    }
    
}
