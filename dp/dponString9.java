class Solution {
   int[][] dp;
    public String shortestCommonSupersequence(String str1, String str2) {
        dp=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        lcs(str1,str2,0,0);
        return scs(str1,str2);
    }
    public String scs(String a,String b){
        StringBuilder res=new StringBuilder();
        // if(dp[i][j]!=null)return dp[i][j];
        // if(i==a.length() && j==b.length())return dp[i][j]= "";
        // if(i==a.length()) return dp[i][j]= b.charAt(j) + scs(a,b,i,j+1);
        // if(j==b.length())return dp[i][j]= a.charAt(i) + scs(a,b,i+1,j);
        // if(a.charAt(i)==b.charAt(j))return dp[i][j]= a.charAt(i)+scs(a,b,i+1,j+1);
        // else{
        //     String op1=a.charAt(i)+scs(a,b,i+1,j);
        //     String op2=b.charAt(j)+scs(a,b,i,j+1);
        //     if(op1.length()<op2.length())return dp[i][j]= op1;
        //     else return dp[i][j]= op2;
        // }
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                res.append(a.charAt(i));
                i++;
                j++;
            }else if(lcs(a,b,i+1,j)>lcs(a,b,i,j+1)){
                res.append(a.charAt(i));
                i++;
            }else{
                res.append(b.charAt(j));
                j++;
            }
        }
        while(i<a.length()) res.append(a.charAt(i++));
        while(j<b.length())res.append(b.charAt(j++));
        return res.toString();
    }
    public int lcs(String a,String b,int i,int j){
        if(i==a.length() || j==b.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=1 + lcs(a,b,i+1,j+1);
        else return dp[i][j]= Math.max(lcs(a,b,i+1,j),lcs(a,b,i,j+1));
    }
}
