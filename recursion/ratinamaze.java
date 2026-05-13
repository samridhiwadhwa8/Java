class Solution {
        ArrayList<String> path=new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        boolean[][] vis=new boolean[maze.length][maze.length];
        if(maze[0][0]==0)return path;
        dfs( maze,0,0,"",vis);
        return path;
        
    }
    public void dfs(int[][] maze,int row,int col,String r,boolean[][] vis){
        if(row<0 || row>= maze.length || col<0 || col>= maze[0].length || maze[row][col]==0 || vis[row][col])return ;
        if(row==maze.length-1 && col==maze.length-1){
            path.add(r);
            return ;
        }
        vis[row][col]=true;
        dfs(maze,row+1,col,r+"D",vis);
        dfs(maze,row,col-1,r+"L",vis);
        dfs(maze,row,col+1,r+"R",vis);
        dfs(maze,row-1,col,r+"U",vis);
        
        vis[row][col]=false;
    }
}
