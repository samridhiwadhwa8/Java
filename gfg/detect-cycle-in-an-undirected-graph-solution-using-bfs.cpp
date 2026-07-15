class Pair{
    int node;
    int parent;
    Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
            if(bfs(map,visited,i,-1))return true;
            }
        }
        return false;
        // return dfs(map,new boolean[map.size()],0,-1);
    }
    public boolean bfs(HashMap<Integer,ArrayList<Integer>> map,boolean[] visited,int start,int parent){
       Queue<Pair> q=new LinkedList<>();
       visited[start]=true;
       q.add(new Pair(start,-1));
       while(!q.isEmpty()){
           Pair curr=q.poll();
           int n=curr.node;
           int p=curr.parent;
           if(!map.containsKey(n)){
           continue;
