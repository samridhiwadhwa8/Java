class Solution {
    TreeNode parentx=null;
    TreeNode parenty=null;
    int xdept=-1,ydept=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
       getdandp(root,x,y,0,null);
       return xdept==ydept && parentx!=parenty ? true : false;
    }
    public void getdandp(TreeNode root,int x,int y,int depth,TreeNode parent){
        if(root==null)return ;
        if(root.val==x){
            parentx=parent;
            xdept=depth;
        }
        if(root.val==y){
            parenty=parent;
            ydept=depth;
        }
        getdandp(root.left,x,y,depth+1,root);
        getdandp(root.right,x,y,depth+1,root);
    }
}
