import java.util.*;
class Solution {
    static int[] mergeAndSort(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] combined = new int[m+n];
        for(int i=0;i<n;i++){
            combined[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            combined[n+i]=nums2[i];
        }
        Arrays.sort(combined);
        return combined;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]= mergeAndSort(nums1,nums2);
        int n=res.length;
        double median=0.0;
        for(int i=0;i<n;i++){
            if(n%2!=0){
                median=(res[n/2]);
            }else{
                median=(res[(n-1)/2]+res[n/2])/2.0;
            }
        }
        return median;
    }
}
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int[] nums1 = new int[m];
//         for (int i = 0; i < m; i++) {
//             nums1[i] = sc.nextInt();
//         }
        
//         int n = sc.nextInt();
//         int[] nums2 = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums2[i] = sc.nextInt();
//         }
//         double median = findMedianSortedArrays(nums1, nums2);
//         System.out.println(median);
//     }
// }
