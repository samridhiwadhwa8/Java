class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new int[triangle.size()][triangle.size()+1];
        for(int i=0;i<triangle.size();i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        return sol(triangle,0,0);
    }
    public int sol(List<List<Integer>> triangle,int i,int j){
        if(i==triangle.size())return 0;
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        int take= triangle.get(i).get(j) + Math.min(sol(triangle,i+1,j+1),sol(triangle,i+1,j));
        return dp[i][j]= take;
    }
}
