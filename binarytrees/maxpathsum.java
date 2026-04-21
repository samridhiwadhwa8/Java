class Solution {
    int m=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return m;
    }
    public int max(TreeNode root){
        if(root==null)return 0;
        int left=max(root.left);
        int right=max(root.right);
        int down=root.val+left+right;
        int one=root.val+Math.max(left,right);
        int t=root.val;
        m=Math.max(m,Math.max(down,Math.max(one,t)));
        return Math.max(one,t);
    }
}
