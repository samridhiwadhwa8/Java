/* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */
class Pair{
    int hd;
    Node node;
    Pair(Node curr,int hd){
        this.node=curr;
        this.hd=hd;
    }
}
class Result {
  static void printTopView(Node root) {
   if(root==null)return ;
      Queue<Pair> q=new LinkedList<>();
      TreeMap<Integer,Integer> map=new TreeMap<>();
      q.add(new Pair(root,0));
      while(!q.isEmpty()){
          Pair p=q.poll();
          Node curr=p.node;
          int hd=p.hd;
          if(!map.containsKey(hd)){
              map.put(hd,curr.data);
          }
          if(curr.left!=null) q.add(new Pair(curr.left,hd-1));
          if(curr.right!=null) q.add(new Pair(curr.right,hd+1));
      }
      for(int val:map.values()){
          System.out.print(val+" ");
      }
  }
}
