class Pair{
    int timestamp;
    String value;
    Pair(String value,int timestamp){
        this.value=value;
        this.timestamp=timestamp;
    }
}
class TimeMap {
    HashMap<String,ArrayList<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        ArrayList<Pair> list= map.get(key);
        int left=0;
        int right=list.size()-1;
        String ans="";
        while(left<=right){
            int mid=(left+right)/2;
            Pair p=list.get(mid);
            if(p.timestamp==timestamp){
                return p.value;
            }
            else if(p.timestamp<timestamp){
                ans=p.value;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
