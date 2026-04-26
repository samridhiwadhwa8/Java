class Solution {
    int[][][] dp;
    public int maxProfit(int k, int[] prices) {
        dp=new int[k][2][prices.length];
        for(int i=0;i<k;i++){
            for(int j=0;j<=1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return max(k,prices,0,0,1);
    }
    public int max(int k,int[] a,int c,int i,int buy){
        if(c==k)return 0;
        if(i==a.length)return 0;
        if(dp[c][buy][i]!=-1)return dp[c][buy][i];
        if(buy==1){
            return dp[c][buy][i]=Math.max(-a[i]+max(k,a,c,i+1,0),max(k,a,c,i+1,1));
        }else{
            return dp[c][buy][i]=Math.max(a[i]+max(k,a,c+1,i+1,1),max(k,a,c,i+1,0));
        }
    }
}
