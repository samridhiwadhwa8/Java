 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)return false;
    }
        if(p.val!=q.val)return false;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        if(p==null && q==null)return true;
}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
