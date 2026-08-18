class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(max<i){
                max=i;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(k==nums.length){
            return max;
        }
        if(k==1){
            int maxs=-1;
            for(int i:map.keySet()){
                if(map.get(i)==1)
                maxs=Math.max(maxs,i);
            }
            return maxs;
        }
        int maxx=-1;
        if(1<k && k<nums.length){
            if(map.get(nums[0])==1){
                maxx=Math.max(maxx,nums[0]);
            }
         if(map.get(nums[nums.length-1])==1){
                maxx= Math.max(maxx,nums[nums.length-1]);
            }
