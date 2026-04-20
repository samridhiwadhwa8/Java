public class Solution {
        static int max=0;
        static int[][] dp;
    public static int lcs(String str1, String str2){
        dp=new int[str1.length()][str2.length()];
        for(int i=0;i<str1.length();i++){
            java.util.Arrays.fill(dp[i],-1);
        }
        s(str1,str2,str1.length()-1,str2.length()-1);
        return max;
    }
    public static int s(String str1,String str2,int i,int j){
        if(i<0|| j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=0;
        if(str1.charAt(i)==str2.charAt(j)){
        ans=1+s(str1,str2,i-1,j-1);
        max=Math.max(max,ans);
        }
        s(str1,str2,i-1,j);
        s(str1,str2,i,j-1);
        return dp[i][j]=ans;
    }
}
