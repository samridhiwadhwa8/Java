class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(s,t,0,0);
    }
    public int sol(String a,String b,int i,int j){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==a.length() && j==b.length())return dp[i][j]=1;
        if(i==a.length() && j!=b.length())return dp[i][j]= 0;
        if(j==b.length() && i!=a.length())return dp[i][j]=1;
        if(a.charAt(i)==b.charAt(j))return dp[i][j]=sol(a,b,i+1,j)+sol(a,b,i+1,j+1);
        else return dp[i][j]=sol(a,b,i+1,j);
    }
}
