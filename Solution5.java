// import java.util.TreeNode;

import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
       this.val=val;
       this.left=null;
       this.right=null;
    }
}
public class Solution5 {

  TreeNode constructMaximumBinaryTree(int[] nums) {
    if (nums == null)
      return null;
    return build(nums, 0, nums.length - 1);
  }

  private TreeNode build(int[] nums, int start, int end) {
    if (start > end) return null;

    // Identify max index
    int Max = start;
    for (int i = start + 1; i <= end; i++)
      if (nums[i] > nums[Max])
        Max = i;

    // Create a root
    TreeNode root = new TreeNode(nums[Max]);

    // Assign left and right children
    root.left = build(nums, start, Max - 1);
    root.right = build(nums, Max + 1, end);

    return root;
  }
      public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        TreeNode root = sol.constructMaximumBinaryTree(nums);
        System.out.println(root);
        // for(int num : root){
        //    System.out.println(num);
        // }
        scanner.close();
    }
}
