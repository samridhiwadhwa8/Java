    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int p=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(isConnected,vis,i);
                p++;
            }
        }
        return p;
    }
    public void bfs(int[][] adj,boolean[] visited,int start){
        Queue<Integer> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            list.add(p);
            for(int i=0;i<adj.length;i++){
                if(adj[p][i]==1 && !visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
class Solution {
