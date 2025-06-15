class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop found
    }
}

public class LinkedListfastslow{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Creating a loop for testing
        //  list.head.next.next.next = list.head.next.next;

        if (list.detectLoop()) {
            System.out.println("Loop found in the linked list.");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}

