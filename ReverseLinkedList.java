
import java.util.Stack;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class ReverseLinkedList {
    Node head;
    void reverseUsingStack() {
        if (head == null || head.next == null) {
            // If the list is empty or contains only one node, no need to reverse
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = head;

        // Push all nodes onto the stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Pop nodes from the stack and construct the reversed linked list
        head = stack.pop();
        current = head;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null; // Set the next of the last node to null
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next; 
        }
        curr.next = newNode; 
    }
    

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println("Original Linked list:");
        list.printList();

        list.reverseUsingStack();
        System.out.println("Reversed Linked list:");
        list.printList();
    }
}

