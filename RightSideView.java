import java.util.*;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }
}

// DFS Solution (Recursive)
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSideViewDFS(root, 1, result);
        return result;
    }

    private void rightSideViewDFS(TreeNode node, int depth, List<Integer> result) {
        if (node == null) {
            return;
        }

        // If we are visiting this depth for the first time, add the node value
        if (depth > result.size()) {
            result.add(node.val);
        }

        // Visit right subtree first, then left subtree
        rightSideViewDFS(node.right, depth + 1, result);
        rightSideViewDFS(node.left, depth + 1, result);
    }
}

// BFS Solution (Iterative)
class Solution2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode lastNode = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                lastNode = node; // Store the last node of each level

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            // Add the last node of this level to the result
            result.add(lastNode.val);
        }

        return result;
    }
}

// Driver Code for Testing
public class RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution dfsSolution = new Solution();
        System.out.println("Right Side View (DFS): " + dfsSolution.rightSideView(root));

        Solution2 bfsSolution = new Solution2();
        System.out.println("Right Side View (BFS): " + bfsSolution.rightSideView(root));
    }
}
