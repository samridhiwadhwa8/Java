class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return s(word1,word2,0,0);
    }
    public int s(String a,String b,int i,int j){
        if(i==a.length())return b.length()-j;
        if(j==b.length())return a.length()-i;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]=s(a,b,i+1,j+1);
        else return dp[i][j]= 1+Math.min(s(a,b,i+1,j),Math.min(s(a,b,i,j+1),s(a,b,i+1,j+1)));
    }
}
