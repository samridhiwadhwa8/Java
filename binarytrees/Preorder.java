class Solution {
       //DFS
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
// Iterative Approach
class Solution {
       List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(TreeNode root) {
    if(root==null)return res;
    Stack<TreeNode> st=new Stack<>();
    st.push(root);
    while(!st.isEmpty()){
        TreeNode curr=st.pop();
        res.add(curr.data);
        if(curr.right!=null){
            st.push(curr.right);
        }
        if(curr.left!=null){
            st.push(curr.left);
        }
    }
       return res;
    }
}
