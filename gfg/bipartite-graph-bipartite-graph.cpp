class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        int[] color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1){
            if(!bfs(map,i,0,color))return false;
        }
        }
        return true;
        }
        public boolean bfs(HashMap<Integer,ArrayList<Integer>> map,int currnode,int currcolor,int[] color){
           Queue<Integer> q=new LinkedList<>();
            color[currnode]=currcolor;
            q.add(currnode);
            while(!q.isEmpty()){
                int node=q.poll();
                if(map.containsKey(node)){
                for(int v:map.get(node)){
                    if(color[v]==color[node])return false;
                if(color[v]==-1){
                    color[v]=1-color[node];
                q.add(v);
                }
                }
                }
            }
            return true;
        }
}
