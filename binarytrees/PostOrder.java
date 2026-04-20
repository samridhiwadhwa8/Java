//DFS Approach
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
//Iterative Approach
class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(TreeNode root) {
    Stack<TreeNode> st=new Stack<>();
    Stack<TreeNode> st2=new Stack<>();
    st.push(root);
    while(!st.isEmpty()){
        TreeNode curr=st.pop();
        st2.push(curr);
        if(curr.left!=null)st.push(curr.left);
        if(curr.right!=null)st.push(curr.right);
    }
    while(!st2.isEmpty()){
        TreeNode r=st2.pop();
        res.add(r.data);
    }
    return res;
}
}
