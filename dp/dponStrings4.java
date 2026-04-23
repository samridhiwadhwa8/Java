class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()+1][s.length()+1];
        StringBuilder res=new StringBuilder(s);
        // res=res.reverse();
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        String r=res.reverse().toString();
        return lcs(s,res.toString(),s.length()-1,r.length()-1);
    }
    public int lcs(String s,String res,int i,int j){
        if(i<0|| j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==res.charAt(j)) return dp[i][j]= 1+ lcs(s,res,i-1,j-1);
        else return dp[i][j]= Math.max(lcs(s,res,i-1,j),lcs(s,res,i,j-1));
    }
}
