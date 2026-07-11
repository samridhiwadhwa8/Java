class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int c=0;
    public LRUCache(int capacity) {
        map=new LinkedHashMap<>(capacity,0.75f,true);
        this.c=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
        }else{
            if(map.size()==c){
                int lru=map.entrySet().iterator().next().getKey();
                map.remove(lru);
            }
            map.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
