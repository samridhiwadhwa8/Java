class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[2][prices.length];
        for(int i=0;i<2;i++)Arrays.fill(dp[i],-1);
        return stock(prices,0,1);
    }
    public int stock(int[] prices,int i,int canbuy){
        if(i==prices.length)return 0;
        if(dp[canbuy][i]!=-1)return dp[canbuy][i];
        if(canbuy==1){
            return dp[canbuy][i]=Math.max(-prices[i]+stock(prices,i+1,0),stock(prices,i+1,1));
        }
        if(canbuy==0){
            return dp[canbuy][i]=Math.max(prices[i]+stock(prices,i+1,1),stock(prices,i+1,0));
        }
        return 0;
    }
}
