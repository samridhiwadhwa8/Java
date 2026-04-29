/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root==null)return null;
        // if(root==null || root==p || root==q)return root;
        // TreeNode s=lowestCommonAncestor(root.left,p,q);
        // TreeNode r=lowestCommonAncestor(root.right,p,q);
        // if(s!=null && r!=null)return root;
        // return s!=null ? s : r;
        if(root==null)return null;
        if(p.val<=root.val && q.val>=root.val || q.val<=root.val && p.val>=root.val)return root;
        if(p.val<=root.val && q.val<=root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }
    }
}
