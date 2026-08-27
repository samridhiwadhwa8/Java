        String right=dfs(root.right,arr);
        String left=dfs(root.left,arr);
        if(root==null)return "null";
    public String dfs(TreeNode root,List<TreeNode> arr){
       List<TreeNode> arr = new ArrayList<>();
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> map=new HashMap<>();
class Solution {
 */
 * }
        dfs(root, arr);
        return arr;
        String val=root.val+","+left+","+right;
            map.put(val,map.getOrDefault(val,0)+1);
        if(map.get(val)==2){
            arr.add(root);
        }
        return val;
    }
 *         this.right = right;
 *     }
 *         this.left = left;
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode() {}
 *     TreeNode right;
 *     TreeNode left;
 *     int val;
