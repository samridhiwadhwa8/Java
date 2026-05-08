class Solution {
    public void rotate(int[][] matrix) {
        int[][] transpose=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            int j=transpose[0].length-1,k=0;
            while(k<j){
                int temp=transpose[i][k];
                transpose[i][k]=transpose[i][j];
                transpose[i][j]=temp;
                k++;
                j--;
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                matrix[i][j]=transpose[i][j];
            }
        }
    }
}
