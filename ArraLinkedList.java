class LinkedList {
    int data;
    Linkedlist next;
    
    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ArraLinkedList {

    // Function to convert an integer array to a singly linked list
    public static  Linkedlist arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // If the array is empty or null, return null
        }

        Linkedlist head = new LinkedList(arr[0]); // Create the first node with the first element of the array
        Linkedlist current = head; // Keep track of the current node
        for (int i = 1; i < arr.length; i++) {
            current.next = new LinkedList(arr[i]); // Create a new node with the current element
            current = current.next; // Move to the newly created node
        }

        return head; // Return the head of the linked list
    }

    // Function to print the elements of a linked list
    public static void printLinkedList(Linkedlist head) {
        Linkedlist current = head;
        while (current != null) {
            System.out.print(current.data + " -> "); // Print the current node's value
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    // Main method to test the arrayToLinkedList function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Linkedlist head = arrayToLinkedList(arr);
        System.out.println("Linked List:");
        printLinkedList(head);
    }
}
