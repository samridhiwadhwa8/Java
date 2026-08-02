class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int zerocount=0;
        int max=0;
        while(right<nums.length){
            if(nums[right]==0)zerocount++;
            if(zerocount<=1){
                max=Math.max(max,right-left);
            }
            while(zerocount>1){
                if(nums[left]==0) zerocount--;
                left++;
            }
            right++;
        }
        return max;
    }
}
