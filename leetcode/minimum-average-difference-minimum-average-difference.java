class Solution {
    public int minimumAverageDifference(int[] nums) {
        long[] pref=new long[nums.length];
        long[] suff=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            pref[i]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            suff[i]=sum;
        }
        long ls=0, rs=0, min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ls=pref[i]/(i+1);
            if(i==nums.length-1) rs=0;
            else rs=suff[i+1]/(nums.length-i-1);
            long diff=Math.abs(ls-rs);
            if(diff<min){
                min=diff;
                ans=i;
            }
        }
        return ans;
    }
  //optimal approach
  class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0, ls=0, rs=0;
        int ans=0;
        long min=Integer.MAX_VALUE;
        for(int i: nums){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            ls=ls+nums[i];
            if(i==nums.length-1){
                rs=0;
            }else{
            rs=(sum-ls)/(nums.length-i-1);
            }
            long diff= Math.abs(ls/(i+1)- rs);
            if(diff<min){
                min=diff;
                ans=i;
            }
        }
        return ans;
    }
}
}
