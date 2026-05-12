class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        int right=k;int left=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        long max=0;
        if(map.size()==k){
            max=sum;
        }
        while(right<nums.length){
            sum-=nums[left];
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0)map.remove(nums[left]);
                left++;
            sum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.size()==k){
                max=Math.max(max,sum);
            }
            // left++;
            right++;
        }
        return max;
    }
}
