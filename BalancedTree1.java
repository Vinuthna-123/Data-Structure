// import java.util.ArrayList;
import java.util.Scanner;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BalancedTree1 {
    static Tree root;
    public static Tree insert(Tree root,int data){
        if(root==null){
            return new Tree(data);
        }
        if(data < root.data){
            root.left=insert(root.left, data);
        }
        else if(data > root.data){
            root.right=insert(root.right, data);
        }
        return root;
    }
    public int height(Tree tree){
        if(tree==null){
            return 0;
        }
        else{
            int lh=height(tree.left);
            int rh=height(tree.right);
            return Math.max(lh,rh)+1;
        }
    }
    public boolean isbalanced(Tree root){
        if(root==null)
        return true;
        int lh=height(root.left);
        int rh=height(root.right);
        int res= lh-rh;
        if(res==0 || res==1 || res==-1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        BalancedTree1 bt = new BalancedTree1();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the root of the tree:");
        int rootval=in.nextInt();
         root=new Tree(rootval);

       System.out.println("Enter the values in the tree (enter -1 to stop):");
       int value = in.nextInt();
       while (value != -1) {
           root = insert(root, value);
           value = in.nextInt(); //update the values
       }
        if(bt.isbalanced(root)){
            System.out.println("Yes its balanced tree");
        }
        else{
            System.out.println("Its not an balanced tree");
        }
        in.close();

    }

    }
    

