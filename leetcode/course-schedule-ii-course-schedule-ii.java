            }
        }
       ArrayList<Integer> ans=new ArrayList<>();
        bfs(numCourses,map,indegree,ans);
        int j=0;
        int[] arr=new int[ans.size()];
        for(int i:ans){
            arr[j++]=i;
        }
        if(ans.size()==numCourses)
        return arr;
        else
        return new int[0];
                    indegree[v]++;
                }
            if(map.containsKey(i)){
                for(int v:map.get(i)){
        for(int i=0;i<numCourses;i++){
        }
        int[] indegree=new int[numCourses];
            map.putIfAbsent(v,new ArrayList<>());
            map.get(v).add(u);
            map.putIfAbsent(u,new ArrayList<>());
            int v=prerequisites[i][1];
    }
    public void bfs(int nc,HashMap<Integer,ArrayList<Integer>> map,int[] indegree,ArrayList<Integer> ans){
        int j=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nc;i++){
            if(indegree[i]==0)q.add(i);
