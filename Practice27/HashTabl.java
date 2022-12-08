package Practice27;


import java.util.HashMap;

public class HashTabl<K, V>
{
    private HashMap<K,V> hashMap;

    public void hashtabInit() {
        hashMap = new HashMap<K,V>();
    }

    public void hashtabAdd(K key, V value) {
        hashMap.put(key, value);
    }

    public void hashtabDelete(K key) {
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
        } else {
            System.out.println("There's no such key.");
        }
    }

    public V hashtabLookup(K key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            System.out.println("There's no such key.");
        }
        return null;
    }

    public void hashtabHash() {
        for(K ind : hashMap.keySet()) {
            System.out.print(ind + "\t" + "= ");
            System.out.println(hashMap.get(ind));
        }
        System.out.println("\n");
    }
}