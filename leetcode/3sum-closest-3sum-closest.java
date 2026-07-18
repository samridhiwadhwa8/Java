class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs=Integer.MAX_VALUE;
        int l=0;
        for(int k=0;k<nums.length;k++){
            int i=k+1;
            int j=nums.length-1;
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
