/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    
        StringBuilder res=new StringBuilder();
    public String serialize(TreeNode root) {
        
        res.setLength(0);
        int i=0;
        return set(root);
    }
    public String set(TreeNode root){
        if(root==null){
            res.append("null").append(",");
        }else{
            res.append(root.val).append(",");
            set(root.left);
            set(root.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    int i=0;
    public TreeNode deserialize(String data) {
        String[] c=data.split(",");
        return  build(c);
    }
    public TreeNode build(String[] c){
        String val=c[i];
        i++;
        if(val.equals("null"))return null;
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=build(c);
        node.right=build(c);
        return node;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
