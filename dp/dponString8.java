class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()+1][p.length()+1];
        return is(s,p,0,0);
    }
    public boolean is(String s,String p,int i,int j){
        if(dp[i][j]!=null)return dp[i][j];
        if(i==s.length() && j==p.length())return true;
        if(i==s.length() ){
            if(p.charAt(j)!='*')return false;
            return is(s,p,i,j+1);
        }
        if(j==p.length() && i!=s.length())return false;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?' )return dp[i][j]=is(s,p,i+1,j+1);
        if(p.charAt(j)=='*')return dp[i][j]=is(s,p,i,j+1)|| is(s,p,i+1,j);
        return false;
    }
}
//2nd
class Solution {
    int[][] dp;
    public boolean isMatch(String s, String p) {
        dp=new int[s.length()+1][p.length()+1];
        for(int i=0;i<=s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return is(s,p,0,0)==1;
    }
    public int is(String s,String p,int i,int j){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==s.length() && j==p.length())return dp[i][j]=1;
        if(i==s.length()&& j!=p.length() ){
            if(p.charAt(j)!='*')return dp[i][j]=0;
            return dp[i][j]= is(s,p,i,j+1);
        }
        if(j==p.length() && i!=s.length())return dp[i][j]=0;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?' )return dp[i][j]=is(s,p,i+1,j+1);
        
        if(p.charAt(j)=='*'){
        int skip=is(s,p,i,j+1);
        int take=is(s,p,i+1,j);
        if(skip==1|| take==1){
            return dp[i][j]=1;
        }else{
            return dp[i][j]=0;
        }
        }
        return dp[i][j]=0;
    }
}
