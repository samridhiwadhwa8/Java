package recursion;

import java.util.ArrayList;
import java.util.List;

//ANY ONE subsequence with sum = K
public class subseq {
   static  boolean flag=true;
    public static List<List<Integer>> s(List<List<Integer>> res,int[] arr,int k) {
        List<Integer> r = new ArrayList<>();
        ss(r, arr, k, 0, 0,res);
        return res;
    }
    public static void ss(List<Integer> res, int arr[], int k,int sum,int i, List<List<Integer>> r){
        if(i==arr.length){
            if(sum==k && flag==true){
                r.add(new ArrayList<>(res));
//                flag=false;
            }
            return ;
        }
        res.add(arr[i]);
        ss(res,arr,k,sum+arr[i],i+1,r);
        res.remove(res.size()-1);
        ss(res,arr,k,sum,i+1,r);
    }
    public static void main(String[] args){
        int[] a = {1, 2, 1};
        int k = 2;

        List<List<Integer>> arr = new ArrayList<>();

        List<List<Integer>> result = s(arr, a, k);

        System.out.println("Subsequences with sum " + k + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
