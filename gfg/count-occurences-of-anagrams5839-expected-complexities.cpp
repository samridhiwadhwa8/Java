class Solution {

    int search(String pat, String txt) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<pat.length();i++){
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int c=0;
        while(j<txt.length()){
            if(map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
            }
                if(j-i+1==pat.length()){
                    if(counter(map)){
                        c++;
                    }
                    if(map.containsKey(txt.charAt(i))){
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                    }
                    i++;
                }
                
            j++;
            }
            return c;
        }
        boolean counter(HashMap<Character,Integer> map){
            for(int i:map.values()){
                if(i!=0){
                    return false;
                }
            }
            return true;
        }
    }
