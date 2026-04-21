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
//Naive approach
//o(n^2)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int left=diameterOfBinaryTree(root.left);
        int lh=height(root.left);
        int rh=height(root.right);
        int right=diameterOfBinaryTree(root.right);
        return Math.max(lh+rh,Math.max(left,right));
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}
//o(n)
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
       height(root);
       return max;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
}
