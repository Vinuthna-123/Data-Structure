// Print the rotate array but using an collections.
// if ip = 1 2 3 4 5 then op = 2 3 4 5 1 
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4
// 1 2 3 4 5
// the Time complexity of this code is more. TO avoid that we will have an another process which is in Rotate1 

import java.util.*;
public class Rotate {
    public static void RotateList(ArrayList<Integer> l){
        int firstvalue = l.remove(0);
        l.add(firstvalue);
    }
    public static void printList(ArrayList<Integer> l){
        for(int n : l){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5};
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("The given array is :" +a);
        Rotate r = new Rotate(); //creating an object for the class to access the methods.
        for(int i=0;i<a.size();i++){
           r.RotateList(a);
            System.out.print("For" + (i+1) + " Iteration : ");
            r.printList(a);
        }
    }
        
}
