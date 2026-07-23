class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int s=0;
        int e=0;
        int c=0;
        while(e<arr.length){
            sum+=arr[e];
            if(e-s+1==k){
                if(sum/k>=threshold){
                    c++;
                }
                sum-=arr[s];
                s++;
            }
            e++;
        }
        return c;
    }
}
