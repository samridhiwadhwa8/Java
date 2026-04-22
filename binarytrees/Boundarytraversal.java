/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> res=new ArrayList<>();
    ArrayList<Integer> boundaryTraversal(Node root) {
       if(root==null)return res;
       if(!(root.left==null && root.right==null))res.add(root.data);
       addleft(root.left);
       addleaves(root);
       addright(root.right);
       return res;
        
    }
    void addleft(Node root){
        Node curr=root;
        if(root==null)return ;
        while(curr!=null){
            if(!(curr.left==null && curr.right==null))res.add(curr.data);
            if(curr.left!=null)curr=curr.left;
            else curr=curr.right;
        }
    }
    void addleaves(Node root){
        if(root==null)return ;
        Node curr=root;
        if(curr.left==null && curr.right==null)res.add(curr.data);
        addleaves(curr.left);
        addleaves(curr.right);
    }
    void addright(Node root){
        Stack<Integer> st=new Stack<>();
        Node curr=root;
        if(root==null)return ;
        while(curr!=null){
            if(!(curr.left==null && curr.right==null))st.push(curr.data);
            if(curr.right!=null)curr=curr.right;
            else curr=curr.left;
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
    }
    }
