class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] pref=new int[nums.length];
        int[] suffix=new int[nums.length];
        pref[0]=1;
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }
        int j=1;
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=suffix[i]*pref[i];
        }
        return ans;
    }
}
