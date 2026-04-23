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
    List<String> r=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,new StringBuilder());
        return r;
    }
    public void dfs(TreeNode root,StringBuilder a){
        if(root==null)return ;
        int len=a.length();
        if(len>0)a.append("->");
        a.append(root.val);
        if(root.left==null && root.right==null)r.add(a.toString());
        dfs(root.left,a);
        dfs(root.right,a);
        a.setLength(len);
    }
}
