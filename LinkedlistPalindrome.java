class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PalindromeLinkedlist {
    Node head;

    // Insert at the beginning
    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
  // Reverse a linked list
  private Node reverseList(Node head) {
    Node prev = null, current = head, nextNode;
    while (current != null) {
        nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    }
    return prev; // New head after reversal
}

// Check if the linked list is a palindrome
boolean isPalindrome() {
    if (head == null || head.next == null) return true; // Empty or single-node list

    // Step 1: Find the middle of the linked list (slow-fast pointer approach)
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse the second half
    Node secondHalf = reverseList(slow);

    // Step 3: Compare first half and reversed second half
    Node firstHalf = head;
    Node secondHalfCopy = secondHalf; // Keep reference to restore later

    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) {
            reverseList(secondHalfCopy); // Restore original list
            return false;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    // Step 4: Restore the list (optional)
    reverseList(secondHalfCopy);

    return true;
}

public static void main(String[] args) {
    PalindromeLinkedlist list = new PalindromeLinkedlist();

    // Create a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(2);
    list.push(1);

    System.out.println("Linked List:");
    list.printList();

    if (list.isPalindrome()) {
        System.out.println("\nThe linked list is a palindrome.");
    } else {
        System.out.println("\nThe linked list is NOT a palindrome.");
    }
}
}
