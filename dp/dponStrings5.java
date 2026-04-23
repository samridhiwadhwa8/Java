class Solution {
    int[][] dp;
    public int minInsertions(String s) {
        dp=new int[s.length()+1][s.length()+1];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(s,0,s.length()-1);
    }
    public int sol(String s,int i,int j){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j))return dp[i][j]= sol(s,i+1,j-1);
        else return dp[i][j]= 1+ Math.min(sol(s,i+1,j),sol(s,i,j-1));
    }
}
