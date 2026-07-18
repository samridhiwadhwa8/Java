class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int max_left=height[0];
        for(int i=0;i<height.length;i++){
            max_left=Math.max(max_left,height[i]);
            leftmax[i]=max_left;
        }
        int max_right=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            max_right=Math.max(max_right,height[i]);
            rightmax[i]=max_right;
        }
        int h=0;
        for(int i=0;i<height.length;i++){
            h+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return h;
    }
}
