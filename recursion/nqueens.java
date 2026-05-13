class Solution {
    List<List<String>> st=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,0);
        return st;
    }
    public void solve(char[][] board,int row){
        if(row==board.length){
            st.add(con(board));
            return ;
        }
        for(int col=0;col<board[0].length;col++){
            if(issafe(board,col,row)){
                board[row][col]='Q';
                solve(board,row+1);
                board[row][col]='.';
            }
        } 
    }
    public boolean issafe(char[][] board,int col,int row){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row+1,j=col-1;i<board.length && j>=0;i++,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row+1,j=col+1;i<board.length && j<board[0].length;i++,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    public List<String> con(char[][] board){
        List<String> r=new ArrayList<>();
        for(char[] c:board){
            r.add(new String(c));
        }
        return r;
    }
}
