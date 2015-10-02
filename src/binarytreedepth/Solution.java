package binarytreedepth;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    /*
    Simple idea is to keep on going one level deeper and finding the depth at that level.
    Base case : When we reach leaf node return 1.
     */
    public int maxDepth(TreeNode root) {
        int left_depth = 1;
        int right_depth = 1;

        if(root == null)
            return 0;

        if(root.left!=null){
            left_depth = maxDepth(root.left)+1;
        }
        if(root.right!=null){
            right_depth = maxDepth(root.right)+1;
        }

        if(left_depth >= right_depth)
            return left_depth;
        else
            return right_depth;
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
        n1.right = n4;
        return n1;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        TreeNode n1 = createTree();
        //Depth of tree
        System.out.println(sol.maxDepth(n1));

    }
}
