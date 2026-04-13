class Solution {
    Integer[][][] dp;
    public int cherryPickup(int[][] grid) {
        dp=new Integer[grid.length][grid[0].length][grid[0].length];
        return sol(grid,0,0,grid[0].length-1);
    }
    public int sol(int[][] g,int i,int j1,int j2){
        if(i>=g.length || j1<0 || j2<0|| j1>= g[0].length || j2>= g[0].length)return Integer.MIN_VALUE;
        if(i==g.length-1){
            if(j1==j2)return g[i][j1];
            else return g[i][j1]+g[i][j2];
        }
        if(dp[i][j1][j2]!=null)return dp[i][j1][j2];
        int t=0;
        int max = Integer.MIN_VALUE;
        max = Math.max(max, sol(g, i+1, j1-1, j2-1));
        max = Math.max(max, sol(g, i+1, j1-1, j2));
        max = Math.max(max, sol(g, i+1, j1-1, j2+1));
        max = Math.max(max, sol(g, i+1, j1, j2-1));
        max = Math.max(max, sol(g, i+1, j1, j2));
        max = Math.max(max, sol(g, i+1, j1, j2+1));
        max = Math.max(max, sol(g, i+1, j1+1, j2-1));
        max = Math.max(max, sol(g, i+1, j1+1, j2));
        max = Math.max(max, sol(g, i+1, j1+1, j2+1));
        if(j1==j2){
            t=g[i][j1]+ max;
        }else{
            t=g[i][j1]+g[i][j2]+max;
        }
        return dp[i][j1][j2]=t;
    }
}
