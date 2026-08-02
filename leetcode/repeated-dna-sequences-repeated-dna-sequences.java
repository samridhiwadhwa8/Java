class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> res=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int left=0;
        int right=10;
        while(right<=s.length()){
            map.put(s.substring(left,right),map.getOrDefault(s.substring(left,right),0)+1);
            if(map.get(s.substring(left,right))==2){
                res.add(s.substring(left,right));
            }
            left++;
            right++;
        }
        return res;
    }
}
