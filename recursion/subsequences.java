package recursion;
//print subsequences with sum ==k
import java.util.*;
public class subsequences {
    public static List<List<Integer>> sub(List<List<Integer>> arr,int k,int a[]){
        List<Integer> ar=new ArrayList<>();
        s(arr,ar,k,0,0, a);
        return arr;
    }
    public static void s(List<List<Integer>> arr, List<Integer> ar, int k, int sum, int i,int a[]){
        if(i==a.length){
            if(sum==k){
                arr.add(new ArrayList<>(ar));
            }
            return ;
        }
        ar.add(a[i]);
        s(arr,ar,k,sum+a[i],i+1,a);
        ar.remove(ar.size()-1);
        s(arr,ar,k,sum,i+1,a);
    }
    public static void main(String[] args){
        int[] a = {1, 2, 1};
        int k = 2;

        List<List<Integer>> arr = new ArrayList<>();

        List<List<Integer>> result = sub(arr, k, a);

        System.out.println("Subsequences with sum " + k + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
