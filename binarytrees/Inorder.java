//DFS Approach
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
//Iterative Approach
class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorder(TreeNode root) {
    Stack<TreeNode> st=new Stack<>();
    TreeNode curr=root;
    while(curr!=null || !st.isEmpty()){
        while(curr!=null){
            st.push(curr);
            curr=curr.left;
        }
        curr=st.pop();
        res.add(curr.data);
        curr=curr.right;
    }
    return res;
}
}
