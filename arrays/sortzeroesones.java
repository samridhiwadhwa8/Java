class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int zero=0;
        int two=0;
        for(int i:nums){
            if(i==0)zero++;
            if(i==1)one++;
            if(i==2)two++;
        }
        int s=0;
        while(zero-->0){
            nums[s++]=0;
        }
        while(one-->0){
            nums[s++]=1;
        }
        while(two-->0){
            nums[s++]=2;
        }
    }
}
