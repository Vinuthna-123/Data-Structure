class Node {
    int data; // Stores data
    Node next; // Pointer to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList3 {
    Node head; // Head of the linked list

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void reverseList() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move prev to current node
            current = next; // Move current to next node
        }
        head = prev; // Update head to the last node
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();

        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverseList();
        System.out.println("Reversed Linked List:");
        list.printList();
    }
}

 
    

