class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int a= s(coins.length-1,amount,coins);
        return a>=(int) 1e9 ? -1 : a;
    }
    public int s(int i,int a,int[] ar){
        if(i==0){
            if(a%ar[0]==0)return a/ar[0];
            else return (int)1e9;
        }
        if(dp[i][a]!=-1)return dp[i][a];
        int take=(int)1e9;
        int notake= s(i-1,a,ar);
        if(a>=ar[i])take= 1+ s(i,a-ar[i],ar);
        return dp[i][a]=  Math.min(notake,take);
    }
}
