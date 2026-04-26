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
    int i=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int j=0;j<inorder.length;j++){
            map.put(inorder[j],j);
        }
        return bs(preorder,0,inorder.length-1);
    }
    public TreeNode bs(int[] pre,int l,int r){
        if(l>r)return null;
        int val=pre[i++];
        TreeNode root=new TreeNode(val);
        int k=map.get(val);
        root.left=bs(pre,l,k-1);
        root.right=bs(pre,k+1,r);
        return root;
    }
}
