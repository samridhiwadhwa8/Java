class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int left=0;
        int right=0;
        int[] res=new int[nums.length-k+1];
        int l=0;
        // dq.push(right);
        while(right<nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.pollLast();
            }
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
