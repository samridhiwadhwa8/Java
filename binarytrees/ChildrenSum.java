// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) { val = x; }
// }

class Solution {
    boolean checkChildrenSum(TreeNode root) { 
        if(root==null)return true;
        if(root.left==null && root.right==null)return true;
        int left= (root.left!=null)? root.left.val : 0;
        int right=(root.right!=null)? root.right.val : 0;
        if(root.val!=left+right)return false;
        return checkChildrenSum(root.left) && checkChildrenSum(root.right);
    }
}
