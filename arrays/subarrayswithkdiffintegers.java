class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int left=0;
        int right=0;
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                int lt=nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(map.size()==k){
            c+=right-left+1;
            }
            right++;
        }
        return c;
    }
}
