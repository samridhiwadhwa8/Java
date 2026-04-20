
import java.util.*;public class Solution {
    static String[][] dp;
    public static String findLCS(int n, int m, String s1, String s2){
        dp=new String[n][m];
        // sol(n-1,m-1,s1,s2);//filling the dp can be called without return type
        return s(n-1,m-1,s1,s2);
    }
    public static String s(int i,int j,String s1,String s2){
        if(i<0 || j<0)return "";
        if(dp[i][j]!=null)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]= s(i-1,j-1,s1,s2) + s1.charAt(i);
        // else dp[i][j]= Math.max(sol(i-1,j,s1,s2),sol(i,j-1,s1,s2));
        // return dp[i][j];
        String left= s(i-1,j,s1,s2);
        String right=s(i,j-1,s1,s2);
        return dp[i][j]=left.length()>right.length() ? left : right;
    }
    // public static String s(int i,int j,String s1,String s2){
    //     String lcs="";
    //     while(i>=0 && j>=0){
    //         if(s1.charAt(i)==s2.charAt(j)){
    //             lcs= lcs + s1.charAt(i);
    //             i--;j--;
    //         }else{
    //             if(i>0 && dp[i-1][j]>=(j>0 ? dp[i][j-1]: 0)){
    //                 i--;
    //             }else{
    //                 j--;
    //             }
    //         }
    //     }
        
    // StringBuilder s=new StringBuilder(lcs);
    //     return s.reverse().toString();
    // }
}
