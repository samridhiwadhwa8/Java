            int j=nums.length-1;
            int i=k+1;
        for(int k=0;k<nums.length;k++){
        int cs=Integer.MAX_VALUE;
    public int threeSumClosest(int[] nums, int target) {
class Solution {
        int l=0;
        Arrays.sort(nums);
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<cs){
                    cs=Math.abs(sum-target);
                    l=sum;
                }
                if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return l;
    }
}
