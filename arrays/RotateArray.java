class Solution {
    public void rotate(int[] nums, int k) {
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[(i+k)%nums.length]=nums[i];
        // }
        // int s=0;
        // for(int i:arr){
        //     nums[s++]=i;
        // }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
// 2nd
// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
       int[] a=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           a[(i+1)%arr.length]=arr[i];
       }
       int s=0;
       for(int i:a){
           arr[s++]=i;
       }
    }
}
//left rotate
class Solution {
    static void rotateArr(int arr[], int d) {
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
