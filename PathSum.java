class TreeNode{
    int val;
    TreeNode left , right;
    TreeNode(int x){
        this.val = x;
        this.left = null;
    }
}
public class PathSum {
 public boolean hasPathSum(TreeNode root , int sum){
    if(root == null){
        return false;
    }
    if(root.left == null && root.right == null && root.val == sum){
        return true;
    }
    return hasPathSum(root.left , sum - root.val) || hasPathSum(root.right, sum - root.val);
 }

 public static void main(String args[]){
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        PathSum p = new PathSum();

        boolean result = p.hasPathSum(root, targetSum);
        System.out.println("Path with sum " + targetSum + " exists: " + result);
    }
 }
