            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
            }
            right--;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
        while(top<=bottom && left<=right){
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        int left=0;
        int top=0;
        List<Integer> list=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
class Solution {
