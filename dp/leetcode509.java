class Solution {
    public int fib(int n) {
        int[] dp=new int[31];
        Arrays.fill(dp,-1);
        return sol(dp,n);
    }
    //MEMO
    public int sol(int[] dp, int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]= sol(dp,n-1)+ sol(dp,n-2);
    }
    //BOTTOM UP APPROACH
    public int sol(int[] dp, int n){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
