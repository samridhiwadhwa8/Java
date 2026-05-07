class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                max=Math.max(max,c);
            }else{
                c=0;
            }
        }
        return max;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right=0;
        int max=0;
        while(right<nums.length){
            if(nums[right]==0){
                left=right+1;
            }
            if(nums[right]==1){
            max=Math.max(max,right-left+1);
            }
            right++;
        }
        return max;
    }
}
