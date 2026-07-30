class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int right=0;
        int left=0;
        int max=0;
        int maxfreq=0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            for(int i:map.values()){
                maxfreq=Math.max(maxfreq,i);
            }
            while((right-left+1)-maxfreq>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
