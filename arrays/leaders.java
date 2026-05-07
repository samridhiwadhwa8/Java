class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[arr.length-1]);
        int maxright=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(maxright<=arr[i]){
                maxright=arr[i];
                list.add(arr[i]);
            }
            }
        Collections.reverse(list);
        return list;
    }
}
