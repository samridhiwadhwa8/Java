class Solution {
    int[][][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[2][3][prices.length];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return sol(prices,1,2,0);
    }
    public int sol(int[] a,int canbuy,int count,int i){
        if(count==0)return 0;
        if(i==a.length)return 0;
        if(dp[canbuy][count][i]!=-1)return dp[canbuy][count][i];
        if(canbuy==1){
            return dp[canbuy][count][i]= Math.max(-a[i]+sol(a,0,count,i+1),sol(a,1,count,i+1));
        }
        if(canbuy==0){
            return dp[canbuy][count][i]= Math.max(a[i]+sol(a,1,count-1,i+1),sol(a,0,count,i+1));
        }
        return 0;
    }
}
