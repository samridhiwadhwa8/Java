class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<=i;j++){
                r.add(generate(i,j));
            }
            res.add(new ArrayList<>(r));
        }
        return res;

    }
    public int generate(int i,int j){
        if(j==i||j==0)return 1;
        return generate(i-1,j-1)+generate(i-1,j);
    }
}
