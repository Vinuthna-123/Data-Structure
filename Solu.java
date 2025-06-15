// print n "open" and n "closed" using recursion.
// import java.util.LinkedList;
public class Solu {
    public void openclose(int n){
        if(n==0)
        return;
        else{
            System.out.println("Open"+n);
            openclose(n-1);
            System.out.println("Closed"+n);
        }
    }
    public static void main(String[] args){
        Solu l = new Solu();
          l.openclose(5);
    }
}
