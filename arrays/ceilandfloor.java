// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int left=0;
        int right=arr.length-1;
        int i=-1;
        if(x>arr[arr.length-1])return -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=x){
                i=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return i;
    }
}
//floor
class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        if(x<arr[0])return -1;
        int i=0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<=x){
                i=mid;
               left=mid+1;
            }else{
                 right=mid-1;
            }
        }
        return i;
    }
}
