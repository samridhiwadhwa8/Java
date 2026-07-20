class Solution {
    public int[] findOriginalArray(int[] changed) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(changed);
        for(int i=0;i<changed.length;i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }
        int idx=0;
        int[] res=new int[changed.length/2];
        for(int i=0;i<changed.length;i++){
            if(map.get(changed[i])==0)continue;
            if(map.getOrDefault(2*changed[i],0)==0)return new int[] {};
            if(map.getOrDefault(2*changed[i],0)>0){
                    res[idx++]=changed[i];
                    map.put(changed[i],map.get(changed[i])-1);
                    map.put(2*changed[i],map.get(2*changed[i])-1);
                }
        }
        return res;
    }
}
