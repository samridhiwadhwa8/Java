class Solution {
    public int findMiddleIndex(int[] nums) {
        int ts=0;
        for(int i:nums){
            ts+=i;
        }
        int ls=0, rs=0;
        for(int i=0;i<nums.length;i++){
            rs=ts-ls;
            if(ls==rs-nums[i]){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}
