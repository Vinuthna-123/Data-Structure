
import java.util.ArrayList;

public class Duplicate {
    public void Dupli(ArrayList<Integer> arr , int n){
        for(int i=0;i<n;i++){
            boolean dup = false;
            for(int j=i+1;j<n;j++){
             if(arr.get(i).equals(arr.get(j))){
                 // System.out.println(arr.get(i)); this is used to print an Duplicate values.
                dup = true;
                break;
             }
            }
                if(!dup){
                 System.out.println(arr.get(i));
                }
                
            
        }

    }
    public static void main(String args[]){
    ArrayList <Integer> arr = new ArrayList<>();
     arr.add(1);
     arr.add(2);
     arr.add(3);
     arr.add(1);
     arr.add(2);
     Integer n = arr.size()-1;
     Duplicate d = new Duplicate();
     d.Dupli(arr, n);
    }
    
}
