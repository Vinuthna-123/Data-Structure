import java.util.*;
public class Duplicate_hashmap {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter the size of an array:");
        int n = in.nextInt();
        System.out.println("enter the Array elements:");
        for(int i=0;i<n;i++){
            int ar = in.nextInt();
            a.add(ar);
        }
        System.out.print("the array elements are:"+a+"\n");
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(a.get(i).equals(a.get(j))){
        //             System.out.println(a.get(i)+" ");   this code is not working for this case : 1,2,2,2,2,2,2,2,3.

        //         }
        //     }
        // }
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int num:a){
            countMap.put(num,countMap.getordefault(num,0)+1);
        }
        boolean dupli = false;
        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" ");
                dupli = true;
            }
        }
        if(!dupli){
            System.out.println("There is No Duplicate values found .");
        }

        in.close();
    }
}
