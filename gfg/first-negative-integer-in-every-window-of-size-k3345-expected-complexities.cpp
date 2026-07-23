class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        while(j<arr.length){
            if(arr[j]<0)dq.addLast(j);
            if(j-i+1==k){
                if(dq.isEmpty()){
                    list.add(0);
                }else{
                list.add(arr[dq.peekFirst()]);
                }
                if(!dq.isEmpty() && dq.peekFirst()==i){
                    dq.pollFirst();
                }
                i++;
            }
            
            j++;
        }
        return list;
    }
}
