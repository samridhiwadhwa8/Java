class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }
        int[] res=new int[mat.length*mat[0].length];
        for(Integer key: map.keySet()){
                if(key%2==0){
                    Collections.reverse(map.get(key));
                }
            }
            int idx=0;
            for(int i=0;i<=mat.length+mat[0].length-2;i++){
                while(!map.get(i).isEmpty()){
                    res[idx++]=map.get(i).remove(0);
                }
            }
            return res;
    }
}
