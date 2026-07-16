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
//bfs solution
/ class Pair{
//     int node;
//     int parent;
//     Pair(int node,int parent){
//         this.node=node;
//         this.parent=parent;
// }
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
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            if(map.containsKey(i)){
                for(int v:map.get(i)){
                    indegree[v]++;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        bfs(map,indegree,V,ans);
       return ans.size()!=V;
    }
    public void bfs(HashMap<Integer,ArrayList<Integer>> map,int[] indegree,int V,ArrayList<Integer> ans){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if (indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            if(map.containsKey(node)){
                for(int v:map.get(node)){
                    indegree[v]--;
                if(indegree[v]==0)q.add(v);
                }
            }
        }
    }
    }
}
