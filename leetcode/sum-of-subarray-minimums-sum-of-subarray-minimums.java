class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        int[] ns=new int[arr.length];
        int[] nl=new int[arr.length];
        ns=nsr(arr,new Stack<>(),ns);
        nl=nsl(arr,new Stack<>(),nl);
        for(int i=0;i<arr.length;i++){
            long left= i-nl[i];
            long right=ns[i]-i;
            long total=arr[i]*(left*right);
            sum=(sum+total)%1000000007;
        }
        return (int)sum;
    }
    public int[] nsr(int[] arr, Stack<Integer> st,int[] ns){
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())ns[i]=arr.length;
            else ns[i]=st.peek();
            st.push(i);
        }
        return ns;
    }
    public int[] nsl(int[] arr,Stack<Integer> st,int[] nl){
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])st.pop();
