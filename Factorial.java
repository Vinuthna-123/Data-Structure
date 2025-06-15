// we have to write an code in which its time complexity will be o(n!)

// import java.util.ArrayList;

// public class Factorial {
    // public static void fact(Integer j){
    //     Integer factor =1;
    //       for(int i=1;i<=j;i++){
    //          factor = factor*i;
    //       }
    //     System.out.println(factor);
    // }
    // public static void main(String args[]){
    //     Integer facto=1;
    //     Integer j = 5;
    //     for(int i=1;i<=j;i++){
    //        facto = facto * i;
    //     }
    //     System.out.println(facto);
      
        // Factorial.fact(3);
//     }
// }




// Writenan java code to get an space complexity of nlogn.
public class Factorial{
    public static void main(String args[]){
        Integer i=7;
        Integer k=2024;
while(i>0){
    i=i-1;
    while(k>0){
        k=k/2;
        System.out.println(k);
    }
}
    }
}
