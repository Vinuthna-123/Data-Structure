class Node {
	int data;
	Node left;
	Node right;

	Node(int val)
	{
		data = val;
		left = null;
		right = null;
	}
}
public class RightSkewTree {
	public static Node insert(Node root, int data){
		if (root == null) {
			root = new Node(data);
		}
		else {
			root.right = insert(root.right, data);
		}
		return root;
	}
	public static void printTree(Node node)
	{
		if (node != null) {
			System.out.println(node.data);
			printTree(node.right);
		}
	}
	public static void main(String[] args)
	{
		Node root = null;
		root = insert(root, 1);
		insert(root, 2);
		insert(root, 3);
		insert(root, 4);
		insert(root, 5);
		printTree(root);
	}
}

