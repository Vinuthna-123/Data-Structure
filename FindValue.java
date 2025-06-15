import java.util.LinkedList;

public class FindValue {
    public int FindVal(LinkedList<Integer> ll, int value) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        FindValue  f = new FindValue();
    
        int res = f.FindVal(ll,90);
      if(res!=-1){
        System.out.println("The value is found at the index is " + res);
        }  
        else{
            System.out.println("The value is not found in the list....");
        }

    }
}
