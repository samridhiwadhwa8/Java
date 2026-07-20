class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.putIfAbsent(i-j,new PriorityQueue<>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        // for(List<Integer> res:map.values()){
        //     Collections.sort(res);
        // }
        int[][] ma=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ma[i][j]=map.get(i-j).poll();
            }
        }
        return ma;
    }
}
