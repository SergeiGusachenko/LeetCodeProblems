import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    public LinkedHashMap<Integer, Integer> pairs;
    public LRUCache(int capacity) {
        pairs = new LinkedHashMap<Integer, Integer>(capacity, 1, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
       return pairs.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        pairs.put(key,value);
    }
}