class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class RemoveDuplicates {
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

    public void removeduplicate(){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }


    }
    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();

        // Insert sorted elements (duplicates included)
        list.push(5);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(1);  // List: 1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 5 -> 5 -> None

        System.out.println("Original Sorted Linked List:");
        list.printList();

        list.removeduplicate();

        System.out.println("\nLinked List after removing duplicates:");
        list.printList();
    }
}
