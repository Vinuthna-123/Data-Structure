import java.util.Scanner;

class Tree {
    int data;
    Tree left, right;

    Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Balancedtree {
    public Tree Sorted(int[] num) {
        if (num == null) {
            return null;
        }
        return Sorted(num, 0, num.length - 1);
    }

    private Tree Sorted(int[] num, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Tree node = new Tree(num[mid]);
        node.left = Sorted(num, start, mid - 1);
        node.right = Sorted(num, mid + 1, end);
        return node;
    }
    public void Display(Tree node){
          if(node==null)
          return;
          Display(node.left);
          System.out.println(node.data+" ");
          Display(node.right);

    }
    public static void main(String[] args) {
        Balancedtree bt = new Balancedtree();
        Scanner in = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = in.nextInt();
            // bt.add(num[i]);
        }
        Tree root = bt.Sorted(num);
        bt.Display(root);
        in.close();
    }
}
