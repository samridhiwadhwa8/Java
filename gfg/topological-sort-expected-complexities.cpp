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
int[] indegree=new int[V];
for(int i=0;i<V;i++){
    if(map.containsKey(i)){
for(int j:map.get(i)){
    indegree[j]++;
}
}
}
ArrayList<Integer> ans=new ArrayList<>();
bfs(map,indegree,ans,V);
return ans;
}

// Stack<Integer> st=new Stack<>();
// boolean[] visited=new boolean[V];
// for(int i=0;i<V;i++){
//     if(!visited[i]){
//         dfs(map,i,st,visited);
//     }
// }
// ArrayList<Integer> res=new ArrayList<>();
// while(!st.isEmpty()){
//     res.add(st.pop());
// }
// return res;
public void bfs(HashMap<Integer,ArrayList<Integer>> map,int[] indegree,ArrayList<Integer> ans,int V){
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<V;i++){
