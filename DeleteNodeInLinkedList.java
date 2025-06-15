class Node {
    int data;   
    Node next;  

    // Constructor to initialize a node with data.
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeInLinkedList {

    Node head;  // Head pointer for the linked list.

  
    public void push(int new_data) {
        Node new_node = new Node(new_data); // Create a new node.
        new_node.next = head;               // Link the new node with the current head.
        head = new_node;                    // Update head to point to the new node.
    }

    
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("None");
    }

  
    public Node deleteNode(Node head, int key) {
        // If the list is empty, return head.
        if (head == null) {
            return head;
        }

        // If the head node holds the key to be deleted, update head.
        if (head.data == key) {
            return head.next; 
        }

        // Initialize current and previous pointers.
        Node current = head;
        Node prev = null;

        // Traverse the list until the node with the key is found.
        while (current != null && current.data != key) {
            prev = current;        
            current = current.next; 
        }

        // If the key is not present in the list, return the unchanged head.
        if (current == null) {
            return head;
        }

        // Unlink the node to be deleted from the linked list.
        prev.next = current.next;

        // Return the head of the modified list.
        return head;
    }

    public static void main(String[] args) {
        DeleteNodeInLinkedList list = new DeleteNodeInLinkedList();
        list.push(50);
        list.push(40);
        list.push(30);
        list.push(20);
        list.push(10);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        // Delete a node with key 30.
        int keyToDelete = 30;
        list.head = list.deleteNode(list.head, keyToDelete);
        System.out.println("\nLinked List after deleting node with data " + keyToDelete + ":");
        list.printList(list.head);

        // Delete a node with key 10 (deleting the head).
        keyToDelete = 10;
        list.head = list.deleteNode(list.head, keyToDelete);
        System.out.println("\nLinked List after deleting node with data " + keyToDelete + ":");
        list.printList(list.head);
    }
}
