class Solution {
    ArrayList<Integer> find(int arr[], int x) {
    ArrayList<Integer> ar=new ArrayList<>();
    int first=firstocc(arr,x);
    int last=lastocc(arr,x);
    ar.add(first);
    ar.add(last);
    return ar;
    }
    public int firstocc(int arr[],int x){
        int ans=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>x){
                right=mid-1;
            }else if(arr[mid]<x){
                left=mid+1;
            }else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
    public int lastocc(int arr[],int x){
        int ans=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>x){
                right=mid-1;
            }else if(arr[mid]<x){
                left=mid+1;
            }
            else{
                ans=mid;
                left=mid+1;
            }
        }
        return ans;
    }
}

