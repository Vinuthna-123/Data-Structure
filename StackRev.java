public class StackRev {
       private int default_size=10;
       private int[] array;
       private int ref =-1;
       StackRev(){
        this.array= new int[default_size];
       }
       public boolean push(int n){
        ref = ref+1;
        if(ref==array.length){
            ref--;
            return false;
        }
        array[ref]=n;
        return true;
       }
       
       public int pop(){
    //    if(isEmpty()){
    //     return -1;
    //    }
      
       int curr = array[ref];
       array[ref] = 0;
       ref=ref-1;
       return curr;
       }
       public boolean isEmpty(){
        if(ref==array.length){
            return false;
        }
        else{
            return true;                        
        }

       }
       public  void display(){
        for(int i=0;i<=ref;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
       }
    public static void main(String args[]){
        StackRev sr = new StackRev();
        System.out.println(sr.push(10));
        System.out.println(sr.push(20));
        System.out.println(sr.push(30));
        System.out.println(sr.push(40));
        sr.display();
        System.out.println(sr.pop());
        sr.display();
        System.out.println(sr.pop());
        sr.display();


    }
}
