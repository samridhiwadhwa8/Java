class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1)sum+=-1;
            else sum+=1;
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
//binary subarrays
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==goal)c++;
            if(map.containsKey(sum-goal))c+=map.get(sum-goal);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
