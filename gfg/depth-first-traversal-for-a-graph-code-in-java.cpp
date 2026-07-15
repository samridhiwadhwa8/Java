class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        // for(ArrayList<Integer> res:adj){
        //     int u=map.get(0);
        //     int v=map.get(1);
        //     map.putIfAbsent(u,new ArrayList<>());
        //     map.putIfAbsent(v,new ArrayList<>());
        //     map.get(u).add(v);
        //     map.get(v).add(u);
        // }
        ArrayList<Integer> res=new ArrayList<>();
        // res.add(0);
        dfs(0,adj,res,new boolean[adj.size()]);
        return res;
    }
    public void dfs(int start,ArrayList<ArrayList<Integer>> map,ArrayList<Integer> res,boolean[] visited){
        if(visited[start]==true){
            return ;
        }
        visited[start]=true;
        res.add(start);
        for(int v:map.get(start)){
            if(!visited[v]){
                // res.add(v);
                dfs(v,map,res,visited);
            }
        }
    }
}
