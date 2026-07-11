class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        int right=0;
        int left=0;
        long c=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum*(right-left+1)>=k){
                sum-=nums[left];
                left++;
            }
            c+=right-left+1;
            right++;
        }
        return c;
    }
}
