class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return ls(text1,text2,text1.length()-1,text2.length()-1);
    }
    public int ls(String text1,String text2, int i,int j){
        if(i< 0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int s=0,eq=0;
        if(text1.charAt(i)!=text2.charAt(j)) s=Math.max(ls(text1,text2,i-1,j),ls(text1,text2,i,j-1));
        else eq= 1+ ls(text1,text2,i-1,j-1);
        int ans =text1.charAt(i)== text2.charAt(j) ? eq : s;
        return dp[i][j]= ans;
    }
}
