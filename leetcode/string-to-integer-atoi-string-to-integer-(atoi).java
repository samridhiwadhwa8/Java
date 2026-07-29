class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)return 0;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length())return 0;
        int sign=1;
        int num=0;
        if(s.charAt(i)=='-'){sign=-1; i++;}
        else if(s.charAt(i)=='+') {i++;}
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int dig=s.charAt(i)-'0';
            if(num>(Integer.MAX_VALUE-dig)/10){
                return sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num=num*10+dig;
            i++;
        } 
        return num*sign;
    }
}
