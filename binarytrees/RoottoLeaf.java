/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allRootToLeaf(TreeNode root) {
        if(root==null)return res;
        List<Integer> path=new ArrayList<>();
        allRootToLea(root,path);
        return res;
    }
    public void allRootToLea(TreeNode root,List<Integer> path){  
        if(root==null)return ;
        path.add(root.data);
        if(root.left==null && root.right==null) res.add(new ArrayList<>(path));
        allRootToLea(root.left,path);
        allRootToLea(root.right,path);
        path.remove(path.size()-1);
    }
}
