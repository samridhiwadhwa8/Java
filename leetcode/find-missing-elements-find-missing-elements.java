class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=nums[0];
        int end=nums[nums.length-1];
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=start;i<=end;i++){
           if(!map.containsKey(i)){
            list.add(i);
           }
        }
        return list;
    }
}
