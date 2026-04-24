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
 class Pair{
    TreeNode node;
    long index;
    Pair(TreeNode node,long index){
        this.node=node;
        this.index=index;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return -1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        long max=0;
        while(!q.isEmpty()){
            int s=q.size();
        long first=q.peek().index;
        long last=first;
        for(int i=0;i<s;i++){
            Pair p=q.poll();
            long idx= p.index;
            TreeNode node=p.node;
            last=idx;
            if(node.left!=null)q.add(new Pair(node.left,2*idx));
            if(node.right!=null)q.add(new Pair(node.right,2*idx+1));
        }
        max=Math.max(max,last-first+1);
        }
        return (int)max;
    }
}
