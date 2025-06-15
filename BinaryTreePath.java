import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            binaryTreePathsRecu(root, "", result);
        }
        return result;
    }

    private void binaryTreePathsRecu(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }
        
        if (node.left != null) {
            binaryTreePathsRecu(node.left, path + node.val + "->", result);
        }
        
        if (node.right != null) {
            binaryTreePathsRecu(node.right, path + node.val + "->", result);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        
        BinaryTreePath solution = new BinaryTreePath();
        List<String> paths = solution.binaryTreePaths(root);
        
        System.out.println(paths);
    }
}
