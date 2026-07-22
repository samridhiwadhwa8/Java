                    if(col==m-1 || grid[row][col+1]==-1){
                        stuck=true;
                        break;
                    }else{
                        col++;
                    }
                }else{
                    if(col==0 || grid[row][col-1]==1){
                        stuck=true;
                        break;
                    }else{
                        col--;
                    }
                }
                if(grid[row][col]==1){
        int[] res=new int[m];
        for(int ball=0;ball<m;ball++){
            row=0;
            col=ball;
            stuck=false;
            while(row<n && col<m){
        int row=0;
        int col=0;
        int n=grid.length;
        int m=grid[0].length;
        int i=0;
class Solution {
    public int[] findBall(int[][] grid) {
        boolean stuck=false;
