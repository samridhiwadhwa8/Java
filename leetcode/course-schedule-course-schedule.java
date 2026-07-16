class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
                int u=prerequisites[i][0];
                int v=prerequisites[i][1];
                map.putIfAbsent(u,new ArrayList<>());
                map.putIfAbsent(v,new ArrayList<>());
                map.get(u).add(v);
            }
        
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(map.containsKey(i)){
                for(int v:map.get(i)){
                    indegree[v]++;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        bfs(map,numCourses,indegree,ans);
        return ans.size()==numCourses;
    }
    public void bfs(HashMap<Integer,ArrayList<Integer>> map,int nc,int[] indegree,List<Integer> ans){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nc;i++){
            if(indegree[i]==0){
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
