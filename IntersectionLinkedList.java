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
    
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
    
    Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        Node a = headA, b = headB;
        
        while (a != b) {
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        
        return a;
    }
}

public class IntersectionLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        
        Node common = new Node(8);
        common.next = new Node(10);
        
        list1.head = new Node(3);
        list1.head.next = new Node(6);
        list1.head.next.next = new Node(9);
        list1.head.next.next.next = common;
        
        list2.head = new Node(4);
        list2.head.next = common;
        
        System.out.println("List 1:");
        list1.printList();
        System.out.println("List 2:");
        list2.printList();
        
        Node intersection = list1.getIntersectionNode(list1.head, list2.head);
        System.out.println("Intersection at node: " + (intersection != null ? intersection.data : "No intersection"));
    }
}

