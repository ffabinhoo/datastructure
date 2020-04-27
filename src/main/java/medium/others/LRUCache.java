package medium.others;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache( 2 /* capacity */ );
		
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // returns 1
		cache.put(3, 3);    // evicts key 2
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		int t = cache.get(4);       // returns 4
		System.out.println(t);
		
	}
	
	private LinkedHashMap<Integer, Integer> cache;
    private final int CAPACITY;

	public LRUCache(int capacity) {
		cache = new LinkedHashMap<>();
		CAPACITY = capacity;
	}

	public int get(int key) {
		
		if(cache.containsKey(key)) {
	        int value = cache.remove(key);
	        cache.put(key, value);
	        return value;
	    }
	    return -1;

	}

	public void put(int key, int value) {
		
		if(cache.containsKey(key)) {
			cache.remove(key);
	    }else if(cache.size() + 1 > CAPACITY) {
	    	cache.remove(cache.keySet().iterator().next());
	    }
	    cache.put(key, value);
	}

}
