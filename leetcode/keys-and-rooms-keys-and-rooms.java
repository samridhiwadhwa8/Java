class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
       while(!q.isEmpty()){
            int node=q.poll();
            for(int i:rooms.get(node)){
                if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        for(boolean i:visited){
            if(i==false)return false;
        }
        return true;
    }
}
