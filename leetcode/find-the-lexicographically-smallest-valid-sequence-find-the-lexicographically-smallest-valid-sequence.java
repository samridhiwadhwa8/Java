        }
        if(j==word1.length()){
            return dp[i][j][c]=false;
        }
        if(dp[i][j][c]!=null)return dp[i][j][c];
        if(word1.charAt(j)==word2.charAt(i)){
            ans[i]=j;
            if(solve(word1,word2,i+1,j+1,c,ans)){
                dp[i][j][c]=true;
                return true;
            }
            return dp[i][j][c]=solve(word1,word2,i,j+1,c,ans);
        }
    public boolean solve(String word1,String word2,int i,int j,int c,int[] ans){
        if(i==word2.length()){
            return dp[i][j][c]=true;
    }
        return new int[0];
        }
            return ans;
        if(solve(word1,word2,0,0,0,ans)){
        int[] ans=new int[word2.length()];
        // }
        //     Arrays.fill(dp[i],-1);
        // for(int i=0;i<word1.length();i++){
        dp=new Boolean[word2.length()+1][word1.length()+1][2];
    public int[] validSequence(String word1, String word2) {
class Solution {
    static Boolean[][][] dp;
