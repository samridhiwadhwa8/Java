class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {-1,-1};
    }
}
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<numbers.length;i++){
//             if(map.containsKey(target-numbers[i])){
//                 return new int[] {map.get(target-numbers[i])+1,i+1};
//             }
//             map.put(numbers[i],i);
//         }
//         return new int[] {-1,-1};
