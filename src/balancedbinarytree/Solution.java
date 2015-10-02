package balancedbinarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gjhawar on 9/30/15.
 */
public class Solution {


    /*
    The gist of the solution is that when we calculate the depth of each node we know that if the difference between its left and right subtree
    is more than 1 or less than -1 then its not balanced. Hence in such a case we return -1(which shows that the tree is not balanced).
    Hence, we check if get -1 as the left_depth or the right_depth and if that`s the case try to send that up the recursion stack so that we
    can say that if we get -1 as a result from the depthOfTree function then the tree is not balanced else it is balanced.
     */
    public int depthOfTree(TreeNode root){
        int left_depth = 1;
        int right_depth = 1;

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
        //Idea is to return the correct depth if its in the valid bounds of -1 and 1 else return -1 as the depth.
        if(right_depth - left_depth <= 1 && right_depth - left_depth >= -1)
            return Math.max(right_depth, left_depth);
        else
            return -1;

    }

    /*
    If we get -1 as a result from the depthOfTree function then the tree is not balanced else it is balanced.
    */
    public boolean isBalanced(TreeNode root){
        int result = depthOfTree(root);
        if(result == -1)
            return false;
        else
            return true;
    }

    /*
    Example to help
     */
    public static TreeNode createTree(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n2.left = n3;
        return n1;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        TreeNode n1 = createTree();
        System.out.println(sol.isBalanced(n1));
    }
}
