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
        List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        // Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return res;
        // q.add(root);
        // // res.add(root.val);
        // while(!q.isEmpty()){
        //     int s=q.size();
        //     for(int i=0;i<s;i++){
        //         TreeNode p=q.poll();
        //         if(i==s-1){
        //             res.add(p.val);
        //         }
        //         if(p.left!=null)q.add(p.left);
        //         if(p.right!=null)q.add(p.right);
        //     }
        // }
        dfs(root,0);
        return res;
    }
    public void dfs(TreeNode root,int level){
        if(root==null)return ;
        if(res.size()==level){ // res.size()<level call dfs(root,1)
            res.add(root.val);
        }
        dfs(root.right,level+1);
        dfs(root.left,level+1);
    }
}
