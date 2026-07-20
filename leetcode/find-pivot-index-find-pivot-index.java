    //         suffix[i]=sum;
    //     for(int i=nums.length-1;i>=0;i--){
    //        sum+=nums[i];
    //    sum=0;
    //     int[] suffix=new int[nums.length];
            sum+=nums[i];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
class Solution {
    public int pivotIndex(int[] nums) {
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(prefix[i]==suffix[i])return i;
    //     }
    int s=0;
    for(int i=0;i<nums.length;i++){
        if(s==(sum-s-nums[i]))return i;
        s+=nums[i];
    }
        return -1;
    
}
}
