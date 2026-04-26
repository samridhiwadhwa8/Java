class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[2][prices.length];
        for(int i=0;i<2;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(prices,0,1);
    }
    public int sol(int[] a,int i,int buy){
        if(i>=a.length)return 0;
        if(dp[buy][i]!=-1)return dp[buy][i];
        if(buy==1){
            return dp[buy][i]=Math.max(-a[i]+sol(a,i+1,0),sol(a,i+1,1));
        }
        else{
            return dp[buy][i]=Math.max(a[i]+sol(a,i+2,1),sol(a,i+1,0));
        }
    }
}
