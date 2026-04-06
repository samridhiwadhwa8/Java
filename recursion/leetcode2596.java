class Solution {
    public boolean checkValidGrid(int[][] grid) {
        // if(grid[0][0]!=0)return false;
        return sol(grid,0,0,grid.length,0);
    }
    public boolean sol(int[][] grid,int row,int col, int n,int ev){
        if(row< 0 || col >= n || col < 0 || row >= n || grid[row][col]!= ev)return false;
        if(ev==n*n-1)return true;
        boolean a1= sol(grid,row-1,col+2,n,ev+1);
        boolean a2=sol(grid,row+1,col+2,n,ev+1);
        boolean a3=sol(grid,row+2,col+1,n,ev+1);
        boolean a4=sol(grid,row+2,col-1,n,ev+1);
        boolean a5= sol(grid,row+1,col-2,n,ev+1);
        boolean a6= sol(grid,row-1,col-2,n,ev+1);
        boolean a7= sol(grid,row-2,col-1,n,ev+1);
        boolean a8 = sol(grid,row-2,col+1,n,ev+1);
        return a1 || a2|| a3 || a4|| a5|| a6|| a7|| a8;
            }
}
