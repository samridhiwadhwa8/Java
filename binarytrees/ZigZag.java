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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean lr=true;
        while(!q.isEmpty()){
            int s=q.size();
        List<Integer> r=new ArrayList<>();
        for(int i=0;i<s;i++){
            TreeNode a=q.poll();
            r.add(a.val);
            if(a.left!=null)q.add(a.left);
            if(a.right!=null)q.add(a.right);
        }
        if(lr==false){//!lr
            Collections.reverse(r);
        }
        res.add(r);
        //lr=!lr
        if(lr==false){
            lr=true;
        }else{
            lr=false;
        }

        }
        return res;
    }
}
