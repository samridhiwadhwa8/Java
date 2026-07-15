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
            if(dfs(map,visited,i,-1))return true;
            }
        }
        return false;
        
        // return dfs(map,new boolean[map.size()],0,-1);
        
    }
    public boolean dfs(HashMap<Integer,ArrayList<Integer>> map,boolean[] visited,int start,int parent){
        visited[start]=true;
        if(map.containsKey(start)){
        for(int v:map.get(start)){
            if(v==parent)continue;
            if(visited[v]==true)return true;
            if(dfs(map,visited,v,start)){
                return true;
            }
        }
        }
        return false;
    }
}
