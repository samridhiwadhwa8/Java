class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int c=Integer.MAX_VALUE;
        int count=0;
        for(int k=0;k<arr.length;k++){
            int i=k+1;
            int j=arr.length-1;
            while(i<j){
                int su=arr[i]+arr[j]+arr[k];
                if(su<sum){
                    count+=j-i;
                    i++;
                }
                if(su>=sum){
                    j--;
                }
            }
        }
        return count;
    }
}
