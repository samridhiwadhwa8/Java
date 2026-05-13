class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> s=new ArrayList<>();
        sol(n,"",0,0,s);
        return s;
    }
    public void sol(int n,String res,int open,int close,ArrayList<String> s){
        if(open==n/2 && close==n/2){
            if(isbal(res)){
                s.add(res);
            }
            return ;
        }
        if(open<n/2) sol(n,res+"(",open+1,close,s);
        if(close<open)sol(n,res+")",open,close+1,s);
    }
    public boolean isbal(String res){
        int count=0;
        for(char c:res.toCharArray()){
            if(c=='(')count++;
            else count--;
            if(count<0)return false;
        }
        return count==0;
    }
}
