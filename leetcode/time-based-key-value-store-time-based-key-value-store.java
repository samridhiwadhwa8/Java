class Pair{
    int timestamp;
    String value;
    Pair(String value,int timestamp){
        this.value=value;
        this.timestamp=timestamp;
    }
}
class TimeMap {
    HashMap<String,ArrayList<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        ArrayList<Pair> list= map.get(key);
        int left=0;
        int right=list.size()-1;
        String ans="";
        while(left<=right){
            int mid=(left+right)/2;
            Pair p=list.get(mid);
            if(p.timestamp==timestamp){
