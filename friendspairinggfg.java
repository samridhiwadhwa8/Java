class Solution {
    int[] dp;
    public long countFriendsPairings(int n) {
        // code here
        dp=new int[n+1];
        // Arrays.fill(dp,-1L);
        // return sol(n,dp);
        if(n<=2)return n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]= dp[i-1]+(i-1)*dp[i-2];
        }
        return (long)dp[n];
    }
    // public long sol(int n, Long[] dp){
    //     if(n<=2)return n;
    //     if(dp[n]!=-1)return dp[n]; 
    //     dp[n]= sol(n-1,dp) + (n-1)*sol(n-2,dp);
    //     return dp[n];
    // }
}
