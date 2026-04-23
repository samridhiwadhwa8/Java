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
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> r=new ArrayList<>();
        dfs(root,targetSum,r);
        return res;
    }
    public void dfs(TreeNode root,int sum,List<Integer> r){
        if(root==null){
            return ;
        }
        r.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==root.val){
                res.add(new ArrayList<>(r));
            }
        }
        dfs(root.left,sum-root.val,r);
        dfs(root.right,sum-root.val,r);
        r.remove(r.size()-1);
    }
}
