class CLinked{
        int data;
        CLinked next;
        int index;
        CLinked(int data){
            this.data = data;
            // this.index=index;
            this.next=null;
        }
    }
public class CircularLinkedlist {
        static class CLinkedlist{
        CLinked head;
        CLinked tail;
        CLinkedlist(){
            this.head=null;
            this.tail=null;
        }
        public void insert(int data){
            CLinked node = new CLinked(data);
            if(head==null){
                head=node;
                tail=node;
                tail.next=head; // making the circular linked list.
            } 
            else{
                tail.next=node;
                tail=node;
                tail.next=head;
            }
        }
        public void insertIndex(int index ,int data ){
            CLinked current=head;
            CLinked previo = null;
            CLinked node = new CLinked(data);
            for(int i=0;i<index;i++){
                previo=current;
                current=current.next;
            }
            previo.next=node;
            node.next=current;
        }
        public void remove(){
            CLinked current = head;
            CLinked prev = null;
            while(current.next!=head){
                prev=current;
                current=current.next;
            }
            prev.next=current.next;
        }
        void display(){
            if(head == null){
                System.out.println("Circular List is empty....");
                return;
            }
            CLinked current=head;
            do{
                System.out.print(current.data+"->");
                current=current.next;
            }while(current!=head);
            System.out.println("(back to the first node)"); // here we cant give null for circular linkedlist......because the end node is pointing to the firstnode...
        }
    }
    public static void main(String args[]){
        CLinkedlist cl = new CLinkedlist();
        cl.insert(10);
        cl.insert(20);
        cl.insert(30);
        cl.insert(40);
        cl.display();
        cl.remove();
        cl.display();
        cl.insertIndex(2,1);
        cl.display();
    }

    }
