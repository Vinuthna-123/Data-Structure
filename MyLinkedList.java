// Conversion from binary to integer numbers.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    private Node head;
    
    public MyLinkedList() {
        this.head = null;
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
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) return;
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
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) return;
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }

    public int getValue(){
        int num =0;
        Node temp = head;
        while(temp != null){
            num = num * 2 + temp.data;
            temp = temp.next;
        }
        return num;
    }
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(0);
        linkedList.addAtTail(1);
        linkedList.printList();  // 1 -> 0 -> 1 -> None
        System.out.println("Decimal Value: " + linkedList.getValue());
    }
}
