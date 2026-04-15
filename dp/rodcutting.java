class Solution{
    int[][] dp;
    public int RodCutting(int price[], int n) {
        dp=new int[price.length][n+1];
        for(int i=0;i<price.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return s(price,n,price.length-1);
    }
    public int s(int[] p,int n,int i){
        if(i==0){
            return p[0]*n;
        }
        if(dp[i][n]!=-1)return dp[i][n];
        int notake= s(p,n,i-1);
        int take=Integer.MIN_VALUE;
        if(n>=(i+1)){
            take= p[i]+s(p,n-(i+1),i);
        }
        return dp[i][n] =Math.max(take,notake);
    }
}
