import java.util.ArrayDeque;

class Linked {
    int data;
    Linked next;
    Linked(int data){
        this.data = data;
        this.next=null;
    }
}
public class LinkedList2{
    private Linked head;
    LinkedList2(){
       this.head=null; 
    }
    public void insert(int data){
        Linked node= new Linked(data);
        if(head == null){
            head = node;
        }
        else{
            Linked current = head;  // intializing a pointer current to traverse from starting.
            while(current.next !=null){ //it will iterate untill it reaches to the last node..
                current=current.next; // move my current to next node.
            }
            current.next = node; // once it reaches the end of my node then here i will insert my newnode...
        }
    }
    public void addFirst(int data){
        Linked node = new Linked(data);
        node.next=head;
        head=node;
    }
    public void insertIndex(int index,int data){
        Linked node = new Linked(data);
        Linked current = head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        node.next=current.next;
        current.next=node;



    }
    public void removeFirst(){
        if(head!=null){
            head=head.next;
        }
    }
    public void deletelast(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
        }
        else{
            Linked current = head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }
    public void Reverse(){
                ArrayDeque<Linked> stack = new ArrayDeque<>();
                Linked current = head;
                while(current!=null){
                    stack.push(current);
                    current=current.next;
                }
                head=stack.pop();
                current = head;
                while(!stack.isEmpty()){
                    current.next=stack.pop();
                    current=current.next;
                }
                 current.next=null;
    }

    public void display(){
       Linked current = head;
        while(current!=null){
            System.out.print(current.data +"->"+" ");
            current=current.next; // to increment my current/head value.
        }
         System.out.println("null");
    } 
    public static void main(String[] args) {
        LinkedList2 ls = new LinkedList2();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.insert(50);
        ls.insert(60);
        ls.display();
        ls.deletelast();
        System.out.println("After deletion at last:");
        ls.display();
        ls.removeFirst();
        System.out.println("After deletion at first:");
        ls.display();
        ls.addFirst(7);
        System.out.println("After Adding an element at first:");
        ls.display();
        ls.insertIndex(3, 8);
        System.out.println("After adding the data at an particular index...");
        ls.display();
        ls.Reverse();
        System.out.println("The Reversed Array is:");
        ls.display();
    }
}
