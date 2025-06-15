//Reverse an array by using an stack.
import java.util.*;
public class Stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> ar = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = in.nextInt();
        System.out.println("Enter an array elements :");
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            ar.addFirst(a);
        }
        while(!ar.isEmpty()){
        System.out.print(ar.pop()+ " ");}
        
        
    in.close();
    }
    
}
