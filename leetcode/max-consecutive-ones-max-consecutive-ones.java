class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right=0;
        int left=0;
        int max=0;
        while(right<nums.length){
            if(nums[right]==1){
            max=Math.max(max,right-left+1);
            }
            if(nums[right]!=1){
                left=right+1;
            }
            right++;
        }
        return max;
    }
}
