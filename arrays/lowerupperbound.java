//lowerbound
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        int ind=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                ind=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ind;
    }
}

//upper bound
class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        int ind=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                
                ind=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ind;
    }
}
