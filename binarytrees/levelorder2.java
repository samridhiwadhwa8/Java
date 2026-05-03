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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null) return arr;
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<s;j++){
                TreeNode p=q.poll();
                temp.add(p.val);
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
            arr.add(temp);
        }
        Collections.reverse(arr);
        return arr;
    }
    public int level(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}
