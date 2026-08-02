class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int max=0;
        while(right<nums.length){
        int zc=0;
            if(nums[right]==0)zc++;
            if(zc<=k){
                max=Math.max(max,right-left+1);
            }
            while(zc>k){
                if(nums[left]==0)zc--;
                left++;
            }
            right++;
        }
        return max;
    }
}
