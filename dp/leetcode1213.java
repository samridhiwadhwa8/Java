class Solution {
    int[][] dp;
    public int minInsertions(String s) {
        dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        // StringBuilder res=new StringBuilder(s);
        // res=res.reverse();
        return sol(s,0,s.length()-1);
        // int a =lcs(s,new String(res),0,0);
        // return s.length()-a;
    }
    public int sol(String s,int i, int j){
        if(i>=j)return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return sol(s,i+1,j-1);
        return dp[i][j] =1+Math.min(sol(s,i+1,j),sol(s,i,j-1));
    }
    // public int lcs(String s,String r,int i,int j){
    //     if(i==s.length()|| j==r.length())return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     if(s.charAt(i)==r.charAt(j))return dp[i][j] = 1+ lcs(s,r,i+1,j+1);
    //     return dp[i][j] =Math.max(lcs(s,r,i+1,j),lcs(s,r,i,j+1));
    // }
}
