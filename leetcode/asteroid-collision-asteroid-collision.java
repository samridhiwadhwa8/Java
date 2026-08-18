                }else{
                else if(sum>0){
                    asteroids[i]=0;
                    break;
                int sum=asteroids[i]+st.peek();
                if (sum<0)st.pop();
       
        for(int i=0;i<asteroids.length;i++){
            while(!st.isEmpty() &&  st.peek()>0  && asteroids[i]<0){
        Stack<Integer> st= new Stack<>();
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
                    st.pop();
                    asteroids[i]=0;
                    break;
                }
            }
            if(asteroids[i]!=0)st.push(asteroids[i]);
        }
        int s=st.size();
         int[] arr=new int[s];
         for(int i=s-1;i>=0;i--)arr[i]=st.pop();
         return arr;
    }
}
