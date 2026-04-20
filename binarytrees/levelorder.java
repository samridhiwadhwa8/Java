class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int si=qu.size();
            List<Integer> r=new ArrayList<>();
            for(int i=0;i<si;i++){
                TreeNode cur=qu.poll();
                r.add(cur.data);
                if(cur.left!=null)qu.add(cur.left);
                if(cur.right!=null)qu.add(cur.right);
            }
            res.add(new ArrayList<>(r));
        }
        return res;
    }
}
