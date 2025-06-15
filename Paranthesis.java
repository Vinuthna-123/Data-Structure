// to check that given paranthesis is valid or not?

import java.util.ArrayDeque;
// import java.util.ArrayList;
import java.util.Scanner;

public class Paranthesis {
    public static void main(String args[]){
        ArrayDeque<Character> l = new ArrayDeque<>(); // if we gave string then while pushing we will use "".
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Paranthesis:");
        String paran = in.nextLine();
        boolean temp = true;
        for(int i=0;i<paran.length();i++){ // if we use '/0' which means an end of the string this wont work in java. its in c.
          if(paran.charAt(i)=='(' || paran.charAt(i)=='{' || paran.charAt(i)=='['){
            l.push(paran.charAt(i));
          }
          
          else {
            if(l.isEmpty()){
                temp=false; // or else here itself we will print like its not an invalid.
                break;
          }
          else{ 
            switch(l.peek()){
            case '(':
                  if(paran.charAt(i)==')'){
                  l.pop();
                  
                }
                else{
                  System.out.println("Invalid");
                  return;
                }
                  break;
            case '{':
                    if(paran.charAt(i)=='}'){
                    l.pop();
                  }
                  else{
                  System.out.println("Invalid");
                  return;
                }
                  break;
            case '[':
                    if(paran.charAt(i)==']'){
                    l.pop();
                  }
                  else{
                  System.out.println("invalid");
                  return;
                }
                  break;
        }
          }  
      }
    }
    if((l.isEmpty()) && (temp==true)){
      System.out.println("Valid");
   }
   else{
    System.out.println("invalid..");
   }
   in.close();
    }
  }

