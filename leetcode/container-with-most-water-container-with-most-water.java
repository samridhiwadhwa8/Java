class Solution {
    public int maxArea(int[] height) {
        int maxx=0;
        int area=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i;j<height.length;j++){
        //     area=(j-i)*Math.min(height[i],height[j]);
        //     maxx=Math.max(area,maxx);
        // }
        // }
        int i=0;
        int j=height.length-1;
        while(i<j){
            area=(j-i)*Math.min(height[i],height[j]);
            maxx=Math.max(area,maxx);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxx;
    }
}
