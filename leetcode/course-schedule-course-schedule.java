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
                }
                for(int v:map.get(i)){
                    indegree[v]++;
        for(int i=0;i<numCourses;i++){
            if(map.containsKey(i)){
        
        int[] indegree=new int[numCourses];
                map.putIfAbsent(v,new ArrayList<>());
                map.get(u).add(v);
            }
                map.putIfAbsent(u,new ArrayList<>());
                int u=prerequisites[i][0];
                int v=prerequisites[i][1];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
    public boolean canFinish(int numCourses, int[][] prerequisites) {
class Solution {
