class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Doubly {
    private ListNode head;
    private ListNode tail;

    public Doubly() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayForward() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Doubly dll = new Doubly();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Doubly Linked List (Forward):");
        dll.displayForward();

        System.out.println("Doubly Linked List (Backward):");
        dll.displayBackward();
    }
}
