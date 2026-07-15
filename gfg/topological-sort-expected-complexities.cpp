class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
for(int i=0;i<edges.length;i++){
    int u=edges[i][0];
    int v=edges[i][1];
    map.putIfAbsent(u,new ArrayList<>());
    map.putIfAbsent(v,new ArrayList<>());
    map.get(u).add(v);
}
Stack<Integer> st=new Stack<>();
boolean[] visited=new boolean[V];
for(int i=0;i<V;i++){
    if(!visited[i]){
        dfs(map,i,st,visited);
    }
}
ArrayList<Integer> res=new ArrayList<>();
while(!st.isEmpty()){
    res.add(st.pop());
}
return res;
}
public void dfs(HashMap<Integer,ArrayList<Integer>> map,int start,Stack<Integer> st,boolean[] visited){
    // st.push(start);
    visited[start]=true;
    if(map.containsKey(start)){
    for(int v:map.get(start)){
        if(!visited[v]){
            dfs(map,v,st,visited);
            // visited[v]=true;
        }
    }
    }
    st.push(start);
}
}
