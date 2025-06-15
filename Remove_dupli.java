//Remove the duplicates from arraylist by using hashset.

import java.util.HashSet;
import java.util.Scanner;

public class Remove_dupli {
    public static void main(String args[]){
        HashSet<Integer> l = new HashSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = in.nextInt();
        System.out.println("Enter an array elements:");
        for(int i=0;i<n;i++){
            int ai =in.nextInt();
            l.add(ai);
        } // In sets the duplicates or repeated values wont allow it will be ignored automatically.
        for(int arr : l){ 
            System.out.print(arr+" ");
        }
        in.close();
        }
    }

