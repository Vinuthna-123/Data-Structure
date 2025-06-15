// import java.util.ArrayList;

// public class Dynamic_Stack {
//     public Dynamic_Stack(){
//         ArrayList<Integer> stack = new ArrayList<>();   
//     }
//     public void push
//     public static void main(String args[]){

//     }
// }

import java.util.Arrays;

public class Dynamic_Stack {
    private int default_size = 3;
    private int[] array;
    private int ref = -1;

    Dynamic_Stack() {
        this.array = new int[default_size];
    }

    public void push(int n) {
        ref = ref + 1;
        if (ref == array.length) {
            // ref--;
            // return false;
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[ref] = n;
        // return true;
    }

    public int pop() {
        // if(isEmpty()){
        // return -1;
        // }
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        int curr = array[ref];
        array[ref] = 0;
         ref=ref-1;
        return curr;
    }

    public boolean isEmpty() {
        if(ref==array.length){
        return false;
        }
        else{
        return true;
        }
        // return ref == 0;
    }

    public void display() {
        for (int i = 0; i <= ref; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Dynamic_Stack sr = new Dynamic_Stack();
        // System.out.println(sr.push(10));
        // System.out.println(sr.push(20));
        // System.out.println(sr.push(30));
        // System.out.println(sr.push(40));
        // System.out.println(sr.push(50));
        // System.out.println(sr.push(60));
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();
    }
}
