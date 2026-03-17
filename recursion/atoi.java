package recursion;

public class atoi {

        public int myAtoi(String s) {
            if(s.length()==0) return 0;
            int i=0;
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            if(i==s.length()) return 0;
            int sign=1;
            if(s.charAt(i)=='-'){ sign=-1; i++; }
            else if(s.charAt(i)=='+'){ i++; }
            int num=0;
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                int dig = s.charAt(i) - '0';
                if(num > (Integer.MAX_VALUE - dig) / 10)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                num = num * 10 + dig;
                i++;
            }
            return num * sign;
        }
        public static void main(String[] args) {
            atoi obj = new atoi();
            String s1 = "42";
            String s2 = "   -42";
            String s3 = "4193 with words";
            String s4 = "words and 987";
            String s5 = "-91283472332";
            System.out.println(obj.myAtoi(s1));
            System.out.println(obj.myAtoi(s2));
            System.out.println(obj.myAtoi(s3));
            System.out.println(obj.myAtoi(s4));
            System.out.println(obj.myAtoi(s5));
        }
    }
