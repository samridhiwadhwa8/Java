
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left=0;
        int right=0;
        int sum=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(right<arr.length){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                res.add(left+1);
                res.add(right+1);
                return res;
            }
            right++;
        }
        res.add(-1);
        return res;
    }
}
