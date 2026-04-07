class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(grid,0,0);
    }
    public int sol(int[][] grid,int i,int j){
        if(i>= grid.length || j>= grid[0].length)return Integer.MAX_VALUE;
        if(i==grid.length-1 && j== grid[0].length-1)return  grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int right= sol(grid,i,j+1);
        int down = sol(grid,i+1,j);
        return dp[i][j] = grid[i][j] + Math.min(right,down);
    }
}
