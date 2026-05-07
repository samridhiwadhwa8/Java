class Solution {
    public int longestSubarray(int[] nums, int k) {
       int left=0;
       int right=0;
       int sum=0,max=0;
       while(right<nums.length){
        sum+=nums[right];
        while(sum>k){
            sum-=nums[left];
            left++;
        }
        if(sum==k){
            max=Math.max(max,right-left+1);
        }
        right++;
       }
       return max;
    }
}
