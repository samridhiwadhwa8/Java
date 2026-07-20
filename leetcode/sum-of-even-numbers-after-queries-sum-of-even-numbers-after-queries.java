class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res=new int[queries.length];
        int sumeven=0;
        for(int i:nums){
            if(i%2==0)sumeven+=i;
        }
        for(int i=0;i<queries.length ;i++){
            int val=queries[i][0];
            int index=queries[i][1];
            if(nums[index]%2==0){
                sumeven-=nums[index];
            }
            nums[index]=nums[index]+val;
            if(nums[index]%2==0){
                sumeven+=nums[index];
            }
            res[i]=sumeven;
        }
        return res;
    }
}
