class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] p=path.split("/");
        for(String word:p){
            if(word.equals(""))continue;
           else if(word.equals("."))continue;
            else if( word.equals("..")){
                if(!st.isEmpty())
                st.pop();
            }
            else{
                st.push(word);
            }
        }
        StringBuilder a=new StringBuilder();
        for(String w:st){
            
        a.append("/").append(w);

        }
        return a.length()==0 ? "/" : a.toString();
    }
}
