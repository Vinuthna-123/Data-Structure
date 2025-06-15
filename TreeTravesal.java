class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class TreeTravesal{
    static void inorderTraversal(Node node) {
 
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    static void preorderTravesal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderTravesal(node.left);
        preorderTravesal(node.right);

    }
    static void postorderTravesal(Node node){
        if(node == null){
            return;
        }
        postorderTravesal(node.left);
        postorderTravesal(node.right);
        System.out.print(node.data + " ");

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("InorderTravseal is :");
        inorderTraversal(root );
        System.out.println();

        System.out.print("PreorderTravseal is :");
        preorderTravesal(root);
        System.out.println();

        System.out.print("postorderTravseal is :");
        postorderTravesal(root);
        System.out.println();
    }
}
