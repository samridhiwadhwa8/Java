/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int c=b(root);
        return c !=-1;
    }
    public int b(TreeNode root){
        if(root==null)return 0;
        int left=b(root.left);
        if(left==-1)return -1;
        int right=b(root.right);
        if(right==-1)return -1;
       if(Math.abs(left-right)>1)return -1;
       return 1+Math.max(left,right);
    }
}
//OR
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(Math.abs(height(root.left)-height(root.right))>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}
