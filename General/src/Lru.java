import java.util.HashMap;

/**
 * Created by Daniel on 2/5/2017.
 */
public class Lru {
    private final int capacity;
    private HashMap cache;

    public Lru(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Integer, Integer>(capacity);
    }

    public int get(int key) {
        if (cache.get(key) == null)
            return -1;

        return (int)cache.get(key);
    }

    public void put(int key, int value) {
        cache.put(key, value);
        if(cache.size() == capacity * .75){

        }
    }
}
