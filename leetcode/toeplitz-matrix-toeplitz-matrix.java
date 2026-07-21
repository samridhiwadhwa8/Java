class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(map.containsKey(i-j)){
        //             if(matrix[i][j]!=map.get(i-j)){
        //                 return false;
        //             }
        //         }
        //         map.put(i-j,matrix[i][j]);
        //     }
        // }
        // return true;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
