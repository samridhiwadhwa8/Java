            }
                dq.pollLast();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
        int right=0;
        int[] res=new int[nums.length-k+1];
        int l=0;
        // dq.push(right);
        while(right<nums.length){
        Deque<Integer> dq=new LinkedList<>();
        int left=0;
    public int[] maxSlidingWindow(int[] nums, int k) {
            dq.addLast(right);
            if(right-left+1==k){
                res[l++]=nums[dq.peekFirst()];
                if(dq.peekFirst()==left){
                    dq.pollFirst();
                }
                left++;

            }
            right++;
        }
        return res;
    }
}
class Solution {
