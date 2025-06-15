class Node {
    int data;     // Data stored in the node.
    Node next;    // Pointer to the next node.

    // Constructor to create a new node.
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {

    /**
     * Detects a cycle in the linked list using Floyd's Cycle Detection Algorithm.
     * Returns true if a cycle is found, otherwise false.
     */
    public static boolean detectCycle(Node head) {
        Node slow = head;  // Slow pointer moves one step.
        Node fast = head;  // Fast pointer moves two steps.

        while (fast != null && fast.next != null) {
            slow = slow.next;             // Move slow pointer one step.
            fast = fast.next.next;        // Move fast pointer two steps.

            // If the two pointers meet, a cycle exists.
            if (slow == fast) {
                return true;
            }
        }
        // No cycle was detected.
        return false;
    }

    /**
     * Creates a cycle in the linked list by connecting the tail node to the node at position 'pos'.
     * If pos is -1, no cycle is created.
     */
    public static Node createCycle(Node head, int pos) {
        if (pos == -1) {
            return head;
        }

        Node cycleEntry = null;
        Node current = head;
        int index = 0;

        // Traverse the list to find the node at position 'pos'
        while (current.next != null) {
            if (index == pos) {
                cycleEntry = current;
            }
            current = current.next;
            index++;
        }
        // Link the last node's next to the node at position 'pos' to form a cycle.
        current.next = cycleEntry;
        return head;
    }

    /**
     * Utility method to print the linked list.
     * This prints only a limited number of nodes to avoid infinite loops in cyclic lists.
     */
    public static void printList(Node head, int limit) {
        Node current = head;
        int count = 0;
        while (current != null && count < limit) {
            System.out.print(current.data + " -> ");
            current = current.next;
            count++;
        }
        if (current != null) {
            System.out.println("...");
        } else {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        System.out.println("Linked List without cycle:");
        printList(head, 20);

        // Test cycle detection on acyclic list.
        if (detectCycle(head)) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }

        // Create a cycle by linking the last node to the node at position 2 (0-indexed).
        head = createCycle(head, 2);

        System.out.println("\nAfter creating a cycle (printing limited nodes):");
        printList(head, 20);  // Print a limited number of nodes.

        // Test cycle detection on cyclic list.
        if (detectCycle(head)) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
