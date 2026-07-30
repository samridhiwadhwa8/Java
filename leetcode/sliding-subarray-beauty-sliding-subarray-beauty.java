                    c+=freq[i];
                    if(c>=x){
                        res[s]=i-50;
                        break;
                    }
                }
                s++;
                if(nums[left]<0)
                freq[nums[left]+50]--;
                left++;
            }
            right++;
        }
        return res;
                for(int i=0;i<freq.length;i++){
                int c=0;
                res[s]=0;
            if(right-left+1==k){
        while(right<nums.length){
            if(nums[right]<0){
                freq[nums[right]+50]++;
            }
        int s=0;
        int left=0;
        int res[]=new int[nums.length-k+1];
        int[] freq=new int[50];
        int right=0;
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
class Solution {
