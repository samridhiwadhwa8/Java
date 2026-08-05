class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        boolean[] sus=new boolean[n];
        int[] indeg=new int[n];
        for(int i=0;i<invocations.length;i++){
            int u=invocations[i][0];
            int v=invocations[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.get(u).add(v);
            indeg[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        sus[k]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            if(!map.containsKey(p)) continue;
            for(int i:map.get(p)){
                indeg[i]--;
                if(!sus[i]){
                    sus[i]=true;
                    q.add(i);
                }
            }
        }
        boolean canrem=false;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(sus[i] && indeg[i]>0){
                canrem=true;
                break;
            }
            if(!sus[i]){
                arr.add(i);
            }
        }
        if(canrem){
            arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(i);
            }
        }
        return arr;
    }
}
