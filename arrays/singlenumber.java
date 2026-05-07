class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        // int ans=0;
        // for(int i:nums){
        //     ans=ans^i;
        // }
        // return ans;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1)return nums[i];
        }
        return 0;
    }
}
