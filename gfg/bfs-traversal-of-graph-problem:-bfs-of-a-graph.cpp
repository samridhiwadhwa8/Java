class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
                int p=q.poll();
                ans.add(p);
               for(int a:adj.get(p)){
                   if(!visited[a]){
                       visited[a]=true;
                       q.add(a);
                   }
               }
            }
        return ans;
    }
}
