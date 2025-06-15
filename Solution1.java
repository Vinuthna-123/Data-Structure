// given an String ["2","3","+","4","/"];
//we need to covert the given String into an integer and by using an stack we need to get an output. ex: 2+3 = 5, store this result in stack, and taken that number which is 5 and divide that number by 4.
// In this way we have to execute our code.
import java.util.Stack;
class Solution1 {
    public int evalRPN(String[] tokens) {
       Stack<String> stack= new Stack<>();
       for(String token : tokens){
           if(isoperator(token)){
               int num2 = Integer.parseInt(stack.pop());
               int num1 = Integer.parseInt(stack.pop()); 
               int result=0;
               if(token.equals("+")){
                    result = num1+num2;
               }
               else if(token.equals("-")){
                    result = num1 - num2;
               } 
               else if(token.equals("*")){
                    result = num1 * num2;
               } 
               else if(token.equals("/")){
                    result = num1 / num2;
               }  
               stack.push(Integer.toString(result));
           }
           else{
               stack.push(token);
           }

       } 
     return Integer.parseInt(stack.peek());
        
    }
    private boolean isoperator(String str){
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
            return true;
        }
        return false;
    }
    // public static void main(String[] args) {
    //     Solution1.evalRPN("2","1","+","3","/","6");
    // }

    // }
}
