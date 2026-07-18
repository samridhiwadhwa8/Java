class Solution {
    public ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int mul=2;mul<=n;mul++){
            multiply(ans,mul);
        }
        Collections.reverse(ans);
        return ans;
    }
    public void multiply(ArrayList<Integer> list,int mul){
        int carry=0;
        for(int i=0;i<list.size();i++){
            int res=list.get(i)*mul;
            res+=carry;
            list.set(i, res%10);
            carry=res/10;
        }
        while(carry>0){
            list.add(carry%10);
            carry=carry/10;
        }
    }
}
