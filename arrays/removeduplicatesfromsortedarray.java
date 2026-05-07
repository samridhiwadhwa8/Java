class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set=new LinkedHashSet<>();
        int i=0;
        int j=1;
        int c=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}
