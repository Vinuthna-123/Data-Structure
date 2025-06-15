class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinked {
    private Node head;
    
    public MyLinked() {
        head = null;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
}
class DesignLinkedList{
    public static void main(String[] args) {
        MyLinked linkedList = new MyLinked();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);
        linkedList.printList(); // 1 -> 2 -> 3 -> None
        linkedList.deleteAtIndex(1);
        linkedList.printList(); // 1 -> 3 -> None
    }
}

