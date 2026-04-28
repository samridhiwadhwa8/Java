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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // if(root==null)return null;
        TreeNode s=new TreeNode(val);
        // if(s.val<root.val){
        //    s= insertIntoBST(root.left,val);
        // }
        // else{ 
        // s=insertIntoBST(root.right,val);
        // }
        // return root;
        if(root==null)return s;
        in(root,s);
        return root;
    }
    public void in(TreeNode root,TreeNode s){
        if(root==null)return ;
        // if(root.left==null && root.right==null){
        //         if(root.val>s.val){
        //             root.left=s;
        //         }if(root.val<s.val){
        //             root.right=s;
        //         }
        //         return ;
        //     }
        if(root.val<s.val){
            in(root.right,s);
            if(root.right==null){
                root.right=s;
                return ;
            }
        }else{
        in(root.left,s);
        if(root.left==null){
            root.left=s;
            return ;
        }
        }
    }
}
