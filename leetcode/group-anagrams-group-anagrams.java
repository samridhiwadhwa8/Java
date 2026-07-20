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
  //without sorting
   for(String s:strs){
            int[] freq=new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder key=new StringBuilder();
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                key.append((char)(i+'a'));
                freq[i]--;
            }
        }
        map.putIfAbsent(key.toString(),new ArrayList<>());
        map.get(key.toString()).add(s);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> k:map.values()){
            res.add(k);
        }
        return res;
    }
}
}
