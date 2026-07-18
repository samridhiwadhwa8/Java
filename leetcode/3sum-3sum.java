class Solution {
    List<List<Integer>> li=new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int target=-nums[i];
            twosum(nums,target,i+1,nums.length-1,nums[i]);
        }
        return li;
    }
    public void twosum(int[] nums,int target,int start,int end,int first){
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                li.add(Arrays.asList(nums[start],nums[end],first));
                while(start<end && nums[start]==nums[start+1])start++;
                while(start<end && nums[end]==nums[end-1])end--;
                start++;
                end--;
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
    }
}
