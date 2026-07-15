// }
class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
        }
        boolean[] visited=new boolean[V];
        boolean[] path=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
               if( dfs(map,i,visited,path)) return true;
            }
        }
        return false;
    }
    public boolean dfs(HashMap<Integer,ArrayList<Integer>> map,int start,boolean[] visited,boolean[] path){
        visited[start]=true;
        path[start]=true;
        if(map.containsKey(start)){
        for(int v:map.get(start)){
            if(!visited[v]){
                if(dfs(map,v,visited,path)) return true;
            }else{
                if(visited[v]==true && path[v]==true)return true;
            }
        }
        }
        path[start]=false;
        return false;
        
    }
}
