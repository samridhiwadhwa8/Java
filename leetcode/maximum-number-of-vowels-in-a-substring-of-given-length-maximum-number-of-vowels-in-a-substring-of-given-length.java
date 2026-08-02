class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int right=0;
        int max=0;
        int left=0;
        while(right<s.length()){
            if(isvowel(s.charAt(right)))count++;
            while(right-left+1>k){
                if(isvowel(s.charAt(left))) count--;
                left++;
            }
            if(right-left+1==k){
                max=Math.max(max,count);
            }
            right++;
        }
        return max;
    }
    public boolean isvowel(char s){
            if(s=='a'|| s=='e'|| s=='o'|| s=='i'|| s=='u'){
                return true;
            }
        return false;
    }
}
