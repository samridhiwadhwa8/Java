class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int rem=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           rem=sum%k;
            if(map.containsKey(sum%k)){
                if(i-map.get(sum%k)>=2)return true;
            }
                else{
                    map.put(rem,i);
                }
        }
        return false;
    }
}
