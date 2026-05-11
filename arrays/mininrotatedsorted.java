class Solution {
    public int findMin(int[] nums) {
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1])return nums[i+1];
        // }
        // return nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
