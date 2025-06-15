class Fastslo {
    int data;
    Fastslo next;
    // Fastslo next1;

    Fastslo(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FastSlow {
    Fastslo head;
    Fastslo tail;

    public boolean hasCycle() {
        if ((head == null) || (head.next == null)) {
            return false;
        } else {
            Fastslo fast = head.next;
            Fastslo slow = head;
            while (fast != null && fast.next != null) {
                if (slow == fast) {
                    return true; // Cycle detected
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return false;
        }
    }
    //Singly Linkedlist insertion......

    public void insert(int data) {
        Fastslo node = new Fastslo(data);
        if (head == null) {
            head = node;
        } else {
            Fastslo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }
    // Circular linkedlist insertion......
    public void insertcir(int data) {
        Fastslo node = new Fastslo(data);
        if (head == null) {
            head = node;
            tail = node; // Initialize tail when head is null
            tail.next = head; // Making the circular linked list.
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        FastSlow fs = new FastSlow();
        fs.insert(10);
        fs.insert(20);
        fs.insert(30);
        fs.insert(40);
        System.out.println("Does the list have a cycle? " + fs.hasCycle());
        fs.insertcir(1);
        fs.insertcir(2);
        fs.insertcir(3);
        fs.insertcir(40);
        System.out.println("Does the list have a cycle? " + fs.hasCycle());

    }

}
