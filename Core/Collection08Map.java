package Core;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class LearnMap {
    // in map or hash map key can be null or its value can be null
    public void mapHashMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "harsh");
        map.put(2, "harsha");
        map.put(5, "harshaaaa");
        map.put(3, "harshaa");
        map.put(4, "harshaaa");

        Collection<String> values = map.values();
        for (String elem : values) {
            System.out.println(elem);
        }
        Collection<Integer> keys = map.keySet();
        for (Integer elem : keys) {
            System.out.println(elem);
        }

        map.remove(1);
        System.out.println(map);

        Map<String, Integer>mp = new HashMap();
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Aman", mp.getOrDefault("Aman", 0) + 1);
        System.out.println(mp.get("Harsh"));
        System.out.println(mp);
    }
    // in map or hash map key can be null or its value can be null
    void hashMap(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "harsh");
        map.put(2, "harsha");
        map.put(5, "harshaaaa");
        map.put(3, "harshaa");
        map.put(4, "harshaaa");

        Collection<String> values = map.values();
        for (String elem : values) {
            System.out.println(elem);
        }
        Collection<Integer> keys = map.keySet();
        for (Integer elem : keys) {
            System.out.println(elem);
        }

        map.remove(1);
        System.out.println(map);

        HashMap<String, Integer> mp = new HashMap();
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Aman", mp.getOrDefault("Aman", 0) + 1);
        System.out.println(mp.get("Harsh"));
        System.out.println(mp);
    }

    void hashTable(){ // hash table key and value nobody can null
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "harsh");
        map.put(2, "harsha");
        map.put(5, "harshaaaa");
        map.put(3, "harshaa");
        map.put(4, "harshaaa");

        Collection<String> values = map.values();
        for (String elem : values) {
            System.out.println(elem);
        }
        Collection<Integer> keys = map.keySet();
        for (Integer elem : keys) {
            System.out.println(elem);
        }

        map.remove(1);
        System.out.println(map);

        Hashtable<String, Integer> mp = new Hashtable<>();
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Harsh", mp.getOrDefault("Harsh", 0) + 1);
        mp.put("Aman", mp.getOrDefault("Aman", 0) + 1);
        System.out.println(mp.get("Harsh"));
        System.out.println(mp);
    }
}

public class Collection08Map {
    public static void main(String[] args) {
        LearnMap l = new LearnMap();
        System.out.println("Map-Hash map start");
        l.mapHashMap();
        System.out.println("Map-Hash map end");
        System.out.println("");
        System.out.println("Hash map start");
        l.hashMap();
        System.out.println("Hash map end");
        System.out.println("");
        System.out.println("Hashtable start");
        l.hashTable();
        System.out.println("HashTable map end");
        System.out.println("");
    }
}
