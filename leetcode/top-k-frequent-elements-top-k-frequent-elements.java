class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            pq.add(i);
        }
        int i=0;
        int[] arr=new int[k];
        while(!pq.isEmpty() && k>0){
            arr[i++]=pq.poll();
            k--;
        }
        return arr;
    }
}
