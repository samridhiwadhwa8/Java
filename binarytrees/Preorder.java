class Solution {
       List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(TreeNode root) {
       pre(root);
       return res;
    }
    public void pre(TreeNode root){
        if(root==null)return ;
        res.add(root.data);
        pre(root.left);
        pre(root.right);
    }
}
