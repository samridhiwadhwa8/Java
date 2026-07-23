class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int start=0;
        int end=0;
        long max=0;
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(end<nums.length){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            sum+=nums[end];
            if(end-start+1==k){
                if(map.size()==k){
                max=Math.max(sum,max);
                }
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return max;
    }
}
