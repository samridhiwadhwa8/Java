class Solution {
   static int[][] dp;
    static int lcs(String s1, String s2) {
        dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        // code here
        return lcs(s1,s2,s1.length()-1,s2.length()-1);
    }
    public static int lcs(String a,String b,int i,int j){
        if(i<0|| j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]= 1+lcs(a,b,i-1,j-1);
        return dp[i][j]= Math.max(lcs(a,b,i-1,j),lcs(a,b,i,j-1));
    }
}
