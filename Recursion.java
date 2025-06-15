
public class Recursion {
    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i]);
            future = head;
        }

        return head;
    }

    static void openClose(int x){
        if(x == 0)
            return;
        System.out.println("Open " + x);
        openClose(x-1);
        System.out.println("Close " + x);
    }

    static void printLL(Node head){
        if(head == null)
            return;
        System.out.println(head.data);
        printLL(head.next);
    }

    static void printOneNode(Node temp){
        String nextValue = temp.next==null?"null": String.valueOf(temp.next.hashCode());
        System.out.println("LinkedListNode{" +
                "id=" + temp.getId() +
                ", data=" + temp.data +
                ", next=" + nextValue +
                '}');
    }

    static void printNodeChain(Node node){
        for(Node temp = node; temp!=null; temp = temp.next){
            String nextValue = temp.next==null?"null": String.valueOf(temp.next.hashCode());
            System.out.println("LinkedListNode{" +
                    "id=" + temp.getId() +
                    ", data=" + temp.data +
                    ", next=" + nextValue +
                    '}');
        }
    }

    static void deleteNode(Node prev ,Node head, int target){
        if(head.data == target){
            prev.next = head.next;
            head.next = null;
            System.out.println("removed node");
            printOneNode(head);
            return;}
//        System.out.println(head.data);
        deleteNode(head,head.next,target);
    }

    static int fib(int x){
        if(x<=2){
            return x -1;
        }
        int prev = fib(x-1); //fib(2) -> 1
        int beforeprev = fib(x-2);//fib(1) -> 0
        return prev + beforeprev;
    }

    static int fibIter(int x) {
        if(x<=2){
            return x -1;
        }
        int x1 = 0; //1 1 2
        int x2 = 1; //1 2 3
        for(int i = 3;i<=x;i++){
            int temp = x2;
            x2 = x2 + x1;
            x1 = temp;
        }
        return x2;
    }

    public static void main(String[] args){
        int[] arr = {1,10,5,45,6};
        Node head = createSinglyLinkedListBackward(arr);
        int target = 10;
        System.out.println("BEFORE");
        printNodeChain(head);
        deleteNode(null,head,target);
        System.out.println("AFTER");
        printNodeChain(head);
    }
}
