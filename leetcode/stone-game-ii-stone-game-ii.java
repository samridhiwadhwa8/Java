    int[][][]  dp;
    public int stoneGameII(int[] piles) {
        dp=new int[2][piles.length+1][piles.length+1];
        for(int i=0;i<2;i++){
        for(int j=0;j<piles.length;j++){Arrays.fill(dp[i][j],-1);
        }
        }
        return maxsolveforAlice(1,0,1,piles);
    }
    public int maxsolveforAlice(int person,int i,int m,int[] prices){
        if(i>=prices.length)return 0;
        if(dp[person][i][m]!=-1)return dp[person][i][m];
        int stones=0;
        int result=(person==1)?0 : Integer.MAX_VALUE;
        for(int x=1;x<=2*m && i+x <=prices.length ;x++){
            stones+=prices[i+x-1];
            if(person==1){
                result=Math.max(result,stones+maxsolveforAlice(0,i+x,Math.max(m,x),prices));
            }else{
                result=Math.min(result,maxsolveforAlice(1,i+x,Math.max(m,x),prices));
            }
        }
        return dp[person][i][m]=result;
    }
}
class Solution {
