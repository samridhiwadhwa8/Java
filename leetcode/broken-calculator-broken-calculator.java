class Solution {
    public int brokenCalc(int startValue, int target) {
        int m=0;
        while(startValue<target){
        if(target%2==0){
            target=target/2;
            m++;
        }else{
            target=target+1;
            m++;
        }
        }
        while(startValue>target){
            target+=1;
            m++;
        }
        return m;
}
}
