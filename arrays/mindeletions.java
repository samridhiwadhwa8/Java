class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int del=0;
        for(int i:map.values()){
            while(i>0 && set.contains(i)){
                i--;
                del++;
            }
            set.add(i);
        }
        return del;
    }
}
