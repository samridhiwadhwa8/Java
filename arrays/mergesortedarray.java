class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,s=0;
        int[] nn=new int[n+m];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nn[s++]=nums1[i];
                i++;
            }
            else{
                nn[s++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            nn[s++]=nums1[i];
            i++;
        }
        while(j<n){
            nn[s++]=nums2[j];
            j++;
        }
        int l=0;
        for(int k=0;k<nn.length;k++){
            nums1[l++]=nn[k];
        }
    }
}
