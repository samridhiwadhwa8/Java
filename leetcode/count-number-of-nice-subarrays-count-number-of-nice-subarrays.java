class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)nums[i]=1;
            else nums[i]=0;
        }
        return subarraysum(nums,k);
    }
    public int subarraysum(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int right=0;
        int prefix=0;
        int count=0;
        map.put(0,1);
        while(right<nums.length){
            prefix+=nums[right];
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
            right++;
        }
    return count;
    }
}
