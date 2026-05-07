class Solution {
    public int[] rearrangeArray(int[] nums) {
        // List<Integer> positive= new ArrayList<>();
        // List<Integer> negative=new ArrayList<>();
        // for(int i:nums){
        //     if(i>0) positive.add(i);
        //     if(i<0)negative.add(i);
        // }
        int[] ar=new int[nums.length];
        // int s=0;
        // int i=0,j=0;
        // while(i<positive.size() && j< negative.size()){
        //     ar[s++]=positive.get(i);
        //     ar[s++]=negative.get(j);
        //     i++;
        //     j++;
        // }
        // return ar;
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ar[pos]=nums[i];
                pos+=2;
            }else{
                ar[neg]=nums[i];
                neg+=2;
            }
        }
        return ar;
    }
}
