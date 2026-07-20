class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> k:map.values()){
            res.add(k);
        }
        return res;
    }
}
