class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> (a[0]-b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int nextstart=intervals[i][0];
            int nextend=intervals[i][1];
            if(nextstart<=end){
                end=Math.max(end,nextend);
            }else{
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}
