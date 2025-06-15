class Node {
    int data;
    Node left , right;

public Node(int item){
    data = item;
    left = right = null;
}
}
public class BinarySearchTree {
    static Node insert(Node root , int data){
        if(root == null){
            return new Node(data);
        }
        if(root.data == data){
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left , data);
        }else{
            root.right = insert(root.right , data);
        }
        return root;

    }
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static void main(String args[]){
        Node root = null;

        root = insert(root , 10);
        root = insert(root , 5);
        root= insert(root , 4);
        root = insert(root , 3);
        root = insert(root , 2);
        root = insert(root , 6);
        root= insert(root , 7);
        root = insert(root , 8);
        inorder(root);
    }
    
    
}
