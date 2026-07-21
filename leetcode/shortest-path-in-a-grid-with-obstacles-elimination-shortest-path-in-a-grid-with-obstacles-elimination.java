class Pair{
    int row;
    int col;
    int rem;
    Pair(int row,int col,int rem){
        this.row=row;
        this.col=col;
        this.rem=rem;
    }
}
class Solution {
    public int shortestPath(int[][] grid, int k) {
        boolean[][][] visited=new boolean[grid.length][grid[0].length][k+1];
        int steps=0;
        //up
        if(grid.length == 1 && grid[0].length == 1)
    return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,k));
        visited[0][0][k]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
            Pair curr=q.poll();
            int row=curr.row;
            int col=curr.col;
            int remk=curr.rem;
            if(row == grid.length - 1 && col == grid[0].length - 1)
    return steps;
            //up;
            int nc=col;
            int nr=row-1;
            if(!(nr<0 || nr >=grid.length || nc<0 || nc>= grid[0].length) ){
            if(grid[nr][nc]==0){
            if(!visited[nr][nc][remk]){
                visited[nr][nc][remk]=true;

                q.add(new Pair(nr,nc,remk));
            }
            }else{
                if(remk>0){
                     if(!visited[nr][nc][remk-1]){
                visited[nr][nc][remk-1]=true;
                q.add(new Pair(nr,nc,remk-1));
            }
                }
            }
            }
            //down
            
             nc=col;
            nr=row+1;
            if(!(nr<0 || nr >=grid.length || nc<0 || nc>= grid[0].length) ){
            if(grid[nr][nc]==0){
            if(!visited[nr][nc][remk]){
                visited[nr][nc][remk]=true;

                q.add(new Pair(nr,nc,remk));
            }
            }else{
                if(remk>0){
                     if(!visited[nr][nc][remk-1]){
                visited[nr][nc][remk-1]=true;
                q.add(new Pair(nr,nc,remk-1));
            }
                }
            }
            }
             nc=col-1;
             nr=row;
            if(!(nr<0 || nr >=grid.length || nc<0 || nc>= grid[0].length) ){
            //left
            if(grid[nr][nc]==0){
            if(!visited[nr][nc][remk]){
                visited[nr][nc][remk]=true;

                q.add(new Pair(nr,nc,remk));
            }
            }else{
                if(remk>0){
                     if(!visited[nr][nc][remk-1]){
                visited[nr][nc][remk-1]=true;
                q.add(new Pair(nr,nc,remk-1));
            }
                }
            }
            }
            nc=col+1;
            nr=row;
            if(!(nr<0 || nr >=grid.length || nc<0 || nc>= grid[0].length) ){
            if(grid[nr][nc]==0){
            if(!visited[nr][nc][remk]){
                visited[nr][nc][remk]=true;

                q.add(new Pair(nr,nc,remk));
            }
            }else{
                if(remk>0){
                     if(!visited[nr][nc][remk-1]){
                visited[nr][nc][remk-1]=true;
                q.add(new Pair(nr,nc,remk-1));
            }
                }
            }
            }
            }
            steps++;
        }
        return -1;
    }
}
