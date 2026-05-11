class Solution {
    int floorSqrt(int n) {
        int left=0;
        int right=n;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
           if(mid*mid<=n){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
