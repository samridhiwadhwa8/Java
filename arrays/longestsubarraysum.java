public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int right=0;
        int left=0;
        int sum=0,max=0;
        while(right<a.length){
                sum+=a[right];
                
            while(sum>k){
                sum=sum-a[left];
                left++;
            }
            if(sum==k){
                max=Math.max(max,right-left+1);
            }
            right++;
        }
        return max;
    }
}
