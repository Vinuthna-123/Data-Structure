//Palindrome checker using an doubly Linked list.....
class Node {
    char data;
    Node next, prev;

    Node(char d) {
        data = d;
        next = prev = null;
    }
}

public class PalindromeLinkedList {

    static Node append(Node head, char data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node front = head;
        Node back = head;
        while (back.next != null)
            back = back.next;

        while (front != back && front.prev != back) {
            if (front.data != back.data)
                return false;
            front = front.next;
            back = back.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = null;
        head = append(head, 'm');
        head = append(head, 'a');
        head = append(head, 'd');
        head = append(head, 'a');
        head = append(head, 'y');
        if (isPalindrome(head))
            System.out.println("Yes, it is a palindrome.");
        else
            System.out.println("No, it is not a palindrome.");
    }
}
