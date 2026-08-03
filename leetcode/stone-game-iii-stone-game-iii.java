class Solution {
    int[] dp;
    public String stoneGameIII(int[] stoneValue) {
        dp=new int[stoneValue.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        int max=dfs(stoneValue,0);
        if(max>0)return "Alice";
        if(max<0)return "Bob";
        return "Tie";
    }
    public int dfs(int[] stonevalue,int i){
        if(i>=stonevalue.length)return 0;
        if(dp[i]!=Integer.MIN_VALUE)return dp[i];
        int max=Integer.MIN_VALUE;
        int take=0;
        for(int k=0;k<3 && i+k<stonevalue.length;k++){
            take+=stonevalue[i+k];
            max=Math.max(max,take-dfs(stonevalue,i+k+1));
        }
        return dp[i]=max;
    }
}

