class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int left=0;
        int right=0;
        int c=0;
        while(right<nums.length){
            prod=prod*nums[right];
            while(prod>=k){
                if(k<=1)return 0;
                prod=prod/nums[left];
                left++;
            }
            c+=(right-left+1);
            right++;
        }
        return c;
    }
}
