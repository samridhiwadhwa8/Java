class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            map.putIfAbsent(reservedSeats[i][0],new ArrayList<>());
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }
        int count=(n-map.size())*2;
        for(int i:map.keySet()){
        boolean left=true;
        boolean right=true;
        boolean middle=true;
            for(int seat:map.get(i)){
                if(seat>=2 && seat<=5)left=false;
                if(seat>=4 && seat<=7)middle=false;
                if(seat>=6 && seat<=9)right=false;
            }
        if(left && right){
            count+=2;
        }
        else if(left==false && middle==true && right==false)count+=1;
        else if(left|| right)count+=1;
        else count+=0;
        }
        return count;
    }
}
