class Solution {
    public long subarrayXor(int arr[], int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int xor=0,c=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            if(xor==k){
                c++;
            }
            if(map.containsKey(xor^k)){
                c+=map.get(xor^k);
            }
                map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return c;
    }
}
