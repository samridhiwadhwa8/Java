class Solution {
    int countFreq(int[] arr, int target) {
        int f=firstocc(arr,target);
        int l=lastocc(arr,target);
        return l-f+1;
    }
    public int firstocc(int[] arr,int t){
        int c=0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==t){
                c=mid;
                right=mid-1;
            }else if(arr[mid]>t){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return c;
    }
    public int lastocc(int[] arr,int t){
        int c=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==t){
                c=mid;
                left=mid+1;
            }else if(arr[mid]<t){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return c;
    }
}
