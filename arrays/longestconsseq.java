class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])continue;
            if(nums[i]+1==nums[i+1]){
                c++;
                max=Math.max(c,max);
            }else{
                c=1;
            }
        }
        return max;
    }
}
