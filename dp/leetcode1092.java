class Solution {
    int[][] dp;
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
         dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        lcs(n-1,m-1,str1,str2);
        return scs(n-1,m-1,str1,str2);
    }
    public int lcs(int i,int j,String s,String r){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==r.charAt(j)){
            dp[i][j]=1+ lcs(i-1,j-1,s,r);
        }else{
            dp[i][j]=Math.max(lcs(i-1,j,s,r),lcs(i,j-1,s,r));
        }
        return dp[i][j];
    }
    public String scs(int i,int j,String s,String r){
        
    StringBuilder res=new StringBuilder();
        while(i>=0 && j>=0){
        if(s.charAt(i)==r.charAt(j)){
            res.append(s.charAt(i));
            i--;
            j--;
        }
        else{
        if(i> 0 && dp[i-1][j] >=(j>0 ? dp[i][j-1]: 0)){
            res.append(s.charAt(i));
            i--;
        }else{
            res.append(r.charAt(j));
            j--;
        }
        }
    }
    
        while(i>=0){
            res.append( s.charAt(i));
            i--;
        }
        while(j>=0){
           res.append(r.charAt(j));
            j--;
        }
    // if(res.size() == s.length()+r.length() - (lcs(s.length()-1,r.length()-1,s,r)))
    return res.reverse().toString();
}
}
//2nd approach
class Solution {
    int[][] dp;
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        lcs(n-1,m-1,str1,str2);
        String a=lc(n-1,m-1,str1,str2);
        int k=0;
        int i=0,j=0;
        StringBuilder r=new StringBuilder();
        while(k< a.length()){
            while(i<str1.length() && str1.charAt(i)!=a.charAt(k)){
                r.append(str1.charAt(i));
                i++;
            }
            while(j<str2.length() && str2.charAt(j)!=a.charAt(k)){
                r.append(str2.charAt(j));
                j++;
            }
            r.append(str1.charAt(i));
            i++;
            j++;
            k++;
        }
        while(i<str1.length()){
            r.append(str1.charAt(i));
            i++;
        }
        while(j<str2.length()){
            r.append(str2.charAt(j));
            j++;
        }
        return r.toString();
    }
    public int lcs(int i,int j,String a ,String b){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))dp[i][j]= 1+ lcs(i-1,j-1,a,b);
        else dp[i][j]= Math.max(lcs(i,j-1,a,b),lcs(i-1,j,a,b));
        return dp[i][j];
    }
    public String lc(int i,int j,String a,String b){
        StringBuilder res=new StringBuilder();
        while(i>=0 && j>=0){
            if(a.charAt(i)==b.charAt(j)){
                res.append(a.charAt(i));
                i--;
                j--;
            }else{
                if(i>0 && dp[i-1][j]>= (j>0 ? dp[i][j-1]: 0)){
                    i--;
                }else{
                    j--;
                }
            }
        }
        return res.reverse().toString();
    }
}
