class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int n=arr.length;
        int r=0,m=0;
        for(int i=1;i<=n;i++){
            if(map.containsKey(i) && map.get(i)==2)r=i;
            
            if(!map.containsKey(i))m=i;
        }
        list.add(r);
        list.add(m);
        return list;
    }
}
