class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int right=0;
        int left=0;
        int max=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            max=Math.max(right-left+1,max);
            set.add(s.charAt(right));
            right++;
        }
        return max;
    }
}
