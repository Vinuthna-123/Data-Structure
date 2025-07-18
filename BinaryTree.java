class Node {
    public static Object root;
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    private static Node root;

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data + " ");
        }
    }

    public static void main(String args[]) {
        BinaryTree n = new BinaryTree();
        Node.root = null;
        root = n.insert(root, 50);
        n.insert(root, 10);
        n.insert(root, 40);
        n.insert(root, 20);
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Postorder");
        postorder(root);

    }
}
