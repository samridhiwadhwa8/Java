/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    List<Integer> res=new ArrayList<>();
    public int minValue(Node root) {
        in(root);
        return res.get(0);
    }
    public void in(Node root){
        if(root==null)return ;
        in(root.left);
        res.add(root.data);
        in(root.right);
    }
}
