class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int c=0;
        for(int rowoff=-(n+1);rowoff<n;rowoff++){
            for(int coloff=-(n+1);coloff<n;coloff++){
                c=Math.max(c,countoverla(img1,img2,rowoff,coloff));
            }
        }
        return c;
    }
    public int countoverla(int[][] img1,int[][] img2,int r,int c){
        int count=0;
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1.length;j++){
                if((i+r)>=0 && (j+c)>=0 && (i+r)<img1.length && j+c <img1.length){
                if(img1[i][j]+img2[i+r][j+c]==2)count++;
                }
            }
        }
        return count;
    }
}
