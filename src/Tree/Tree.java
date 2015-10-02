package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gjhawar on 9/30/15.
 */
public class Tree {

    public static int depthOfTree(TreeNode root){
        int left_depth = 0;
        int right_depth = 0;

        if(root!=null)
        {
            System.out.println("Current Tree.TreeNode : "+ root.val);
        }
        if(root == null)
            return 0;

        if(root.left!=null){
            left_depth = depthOfTree(root.left);
            if(left_depth == -1)
                return -1;
            else
                left_depth = left_depth +1;
        }
        if(root.right!=null){
            right_depth = depthOfTree(root.right);
            if(right_depth == -1)
                return -1;
            else
                right_depth = right_depth +1;
        }
        System.out.println(root.val+ " "+ left_depth+ " "+ right_depth );

        if(right_depth - left_depth <= 1 && right_depth - left_depth >= -1)
            return Math.max(right_depth, left_depth);
        else
            return -1;

    }



    public static boolean isBalanced(TreeNode root){
        int result = depthOfTree(root);
        if(result == -1)
            return false;
        else
            return true;
    }



    public static void levelTraversal(TreeNode root){
        Queue q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode n = (TreeNode) q.remove();
            System.out.println(n.val);
            if(n.left!=null)
            q.add(n.left);
            if(n.right!=null)
            q.add(n.right);
        }
    }

    public static TreeNode createTree(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n2.left = n3;
        n1.right = n4;
        return n1;
    }

    public static void main(String args[]){

        TreeNode n1 = createTree();
        //Depth of tree
        //System.out.println(depthOfTree(n1));

        //Level traversal of tree
        //levelTraversal(n1);

        System.out.println(isBalanced(n1));
    }
}
