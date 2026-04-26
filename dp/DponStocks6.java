class Solution {
    int[][] dp;
    public int maxProfit(int[] prices, int fee) {
        dp=new int[2][prices.length];
        for(int i=0;i<2;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(prices,fee,0,1);
    }
    public int sol(int[] a,int fee,int i,int buy){
        if(i==a.length)return 0;
        if(dp[buy][i]!=-1)return dp[buy][i];
        if(buy==1){
            return dp[buy][i]=Math.max(-a[i]+sol(a,fee,i+1,0),sol(a,fee,i+1,1));
        }
        else{
            return dp[buy][i]=Math.max(a[i]+sol(a,fee,i+1,1)-fee,sol(a,fee,i+1,0));
        }
    }
}
