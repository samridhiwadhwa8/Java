class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=firstoccurence(nums,target);
        arr[1]=lastocc(nums,target);
        return arr;
    }
    public int firstoccurence(int[] nums,int t){
        int left=0;
        int right=nums.length-1,i=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==t){
                i=mid;
                right=mid-1;
            }else if(nums[mid]>t){
                right=mid-1;
                }else{
                left=mid+1;
            }
        }
        return i;
    }
    public int lastocc(int[] arr,int t){
        int left=0;
        int right=arr.length-1;
        int i=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==t){
                i=mid;
                left=mid+1;
            }
            else if(arr[mid]<t){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return i;
    }
}
