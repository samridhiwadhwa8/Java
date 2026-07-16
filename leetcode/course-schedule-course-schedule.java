            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        bfs(map,numCourses,indegree,ans);
        return ans.size()==numCourses;
    }
    public void bfs(HashMap<Integer,ArrayList<Integer>> map,int nc,int[] indegree,List<Integer> ans){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nc;i++){
            if(indegree[i]==0){
                q.add(i);
            }
                for(int v:map.get(i)){
                    indegree[v]++;
                }
            }
        
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(map.containsKey(i)){
                map.get(u).add(v);
                map.putIfAbsent(v,new ArrayList<>());
                map.putIfAbsent(u,new ArrayList<>());
                int u=prerequisites[i][0];
                int v=prerequisites[i][1];
        for(int i=0;i<prerequisites.length;i++){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
class Solution {
