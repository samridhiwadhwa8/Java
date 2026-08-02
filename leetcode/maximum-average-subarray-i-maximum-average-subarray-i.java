class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int right=0;
        int left=0;
        double sum=0;
        double max=Integer.MIN_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                max=Math.max(max,sum/k);
            }
            right++;
        }
        return max;
    }
}
