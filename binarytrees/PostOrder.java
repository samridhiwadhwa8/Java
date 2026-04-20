class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(TreeNode root) {
       post(root);
       return res;
    }
    public void post(TreeNode root){
        if(root==null)return ;
        post(root.left);
        post(root.right);
        res.add(root.data);
    }
}
