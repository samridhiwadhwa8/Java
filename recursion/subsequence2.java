package recursion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
//COUNT subsequences with sum = K
public class subsequence2 {
    public static int s(int[] s,int k){
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        ss(r,s,k,0,0,res);
        return r.size();
    }
    public static void ss(List<List<Integer>> r, int[] s, int k, int i,int sum, List<Integer> res){
        if(i==s.length){
            if(k==sum){
                r.add(new ArrayList<>(res));
            }
            return ;
        }
        res.add(s[i]);
        ss(r,s,k,i+1,sum+s[i],res);
        res.remove(res.size()-1);
        ss(r,s,k,i+1,sum,res);
    }
    public static void main(String[] args){
        int[] a = {1, 2, 1,1};
        int k = 2;
       int result = s( a, k);

        System.out.println("No of Subsequences with sum " + k + ":" +result );
    }
}
