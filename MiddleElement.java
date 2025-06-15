class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MiddleElement {
    Node head;
    public void push(int newdata){
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }

    public Node findMiddle(){
        if(head == null){
            return null;
        }
           Node slow = head , fast = head;
           while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
           }
           return slow;

    }
    public static void main(String[] args) {
        MiddleElement list = new MiddleElement();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1); // Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> None

        System.out.println("Linked List:");
        list.printList();

        Node middle = list.findMiddle();
        if (middle != null) {
            System.out.println("\nMiddle of the Linked List: " + middle.data);
        } else {
            System.out.println("\nThe linked list is empty.");
        }
    }
}
