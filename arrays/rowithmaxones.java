class Solution {
    public int firstocc(int[] arr){
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==1){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public int rowWithMax1s(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int ri=-1;
        int max=-1;
        for(int i=0;i<n;i++){
            int first=firstocc(arr[i]);
            if(first!=-1){
                int count=m-first;
            if(count>max){
                max=count;
                ri=i;
            }
            }
        }
        return ri;
    }
};
