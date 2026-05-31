class Solution {
    ArrayList<int[]> ans=new ArrayList<>();
    public int towerOfHanoi(int n, int from, int to, int aux) {
        th(n,from,aux,to);
        return ans.size();
    }
    public void th(int n,int from,int aux,int to){
        if(n==0)return ;
        th(n-1,from,to,aux);
        ans.add(new int[] { from,to});
        th(n-1,aux,from,to);
    }
}
