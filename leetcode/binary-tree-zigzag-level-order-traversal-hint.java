            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                list.add(p.val);
                if(p.left!=null )q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
            level++;
            if(level%2==0){
                Collections.reverse(list);
            }
            res.add(list);
        while(!q.isEmpty()){
            int s=q.size();
        List<Integer> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
class Solution {
 */
 * }
        }
        return res;
    }
}
