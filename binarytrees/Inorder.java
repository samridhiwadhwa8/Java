class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorder(TreeNode root) {
        in(root);
        return res;
    }
    public void in(TreeNode root){
        if(root==null)return ;
        in(root.left);
        res.add(root.data);
        in(root.right);
    }
}
