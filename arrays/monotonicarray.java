class Solution {
    public boolean isMonotonic(int[] nums) {
        int in=0,dec=0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]>nums[i+1])in++;
            if(nums[i]<nums[i+1])dec++;
        }
        if(in!=0 && dec!=0)return false;
        if(in==0 && dec!=0 || in!=0 && dec==0)return true;
        return true;
    }
}
