public class RotateLinkedList {
    class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    ListNode head;
    
    // Constructor to initialize the linked list
    public RotateLinkedList() {
        head = null;
    }
    
    // Push function to add a node at the front of the list
    public void push(int newVal) {
        ListNode newNode = new ListNode(newVal);
        newNode.next = head;
        head = newNode;
    }
    
    // Function to print the linked list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
    
    // Function to rotate the linked list to the right by k positions
    public void rotateRight(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }
        
        // Step 1: Find the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // Step 2: Make the list circular
        tail.next = head;
        
        // Step 3: Find the new head after rotation
        k = k % length;
        if (k == 0) {
            tail.next = null;
            return;
        }
        
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        
        // Step 4: Break the circular link and set the new head
        ListNode newHead = newTail.next;
        newTail.next = null;
        head = newHead;
    }
    
    // Driver code to test the solution
    public static void main(String[] args) {
        RotateLinkedList llist = new RotateLinkedList();
        
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        
        System.out.println("Original List:");
        llist.printList();  // Print the original linked list
        
        // Rotate the list by 2 positions
        int k = 2;
        llist.rotateRight(k);
        
        System.out.println("List after rotating right by " + k + " positions:");
        llist.printList();  // Print the rotated linked list
    }
}


