class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0;
        int totalgas=0;
        for(int i=0;i<gas.length;i++){
            totalcost+=cost[i];
            totalgas+=gas[i];
        }
        if(totalgas<totalcost)return -1;
        int start=0;
        int current_tank=0;
        for(int i=0;i<gas.length;i++){
            current_tank+=gas[i]-cost[i];
            if(current_tank<0){

