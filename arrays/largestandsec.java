class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1,secmax=-1;
        for(int i:arr){
            if(i>max ){
                secmax=max;
                max=i;
            }
            if(i>secmax && i<max){
                secmax=i;
            }
        }
        return secmax;
    }
}
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
