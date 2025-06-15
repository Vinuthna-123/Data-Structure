import java.util.ArrayList;
import java.util.*;
public class Reverse {
    public  void Rev(ArrayList<Integer> a , int start , int end){
        while(start<end){
            int temp = a.get(start);
            a.set(start,a.get(end)); // At the index start , we are going to place the value which is at end.
            a.set(end , temp); // At the index end i am placing my temp value.
            start++;
            end--;
        }
        for(int n : a){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
      ArrayList<Integer> a = new ArrayList<>();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the size of an array:");
      int n = in.nextInt();
      System.out.println("");
    //   a.add(1);
    //   a.add(2);
    //   a.add(3);
    //   a.add(4);
    //   a.add(5);

      Reverse r = new Reverse();
      Integer start =0;
      Integer end = 1;
    r.Rev(a, start, end);
    int s = 2;
    int e= a.size()-1;
    r.Rev(a,s,e);

     in.close();
      }
    }

