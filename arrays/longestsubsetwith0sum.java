import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int sum=0,max=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
			if(sum==0){
				max=i+1;
			}
			if(map.containsKey(sum)){
				int len=i-map.get(sum);
				max=Math.max(max,len);
			}else{
				map.put(sum,i);
			}
		}
		return max;
	}
}
