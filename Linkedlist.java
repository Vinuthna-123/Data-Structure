 import java.util.LinkedList;
public class Linkedlist {
    /* ArrayDequeue/,String> que
     * in queue we will use an que.addFirst("");
     * in queue we will use an que.pollLast("");
     */
    public static void main(String args[]){
         LinkedList<String> ll = new LinkedList<>();
         System.out.println("Add");
         ll.add("Chinnu"); 
         ll.add("suji");
         ll.add("sekhar");
         ll.add(0,"Vinu");
         System.out.println(ll);

         System.out.println("Read");
         System.out.println(ll.get(0));
         System.out.println(ll.getLast());

         System.out.println("Update");
         ll.set(1, "vinee");
         System.out.println(ll);

         System.out.println("Delete");
         ll.remove(2);
         System.out.println(ll);

         System.out.println("Iteration");
         Iterator<String> ix = ll.iterator();
         while (ix.hasNext()) {
            System.out.println(ix.next());
            
         }
         System.out.println(ll);
    }

    public LinkedList next;
}
