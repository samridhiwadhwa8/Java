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
    Map<Integer,Integer> map=new HashMap<>();
    int j;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        j=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return sol(postorder,0,inorder.length-1);
    }
    public TreeNode sol(int[] post,int l,int r){
        if(l>r)return null;
        int val=post[j--];
        TreeNode root=new TreeNode(val);
        int k=map.get(val);
        root.right=sol(post,k+1,r);
        root.left=sol(post,l,k-1);
        return root;
    }
}
