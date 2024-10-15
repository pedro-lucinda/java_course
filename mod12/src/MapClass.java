import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        MapClass mapClass = new MapClass();
        mapClass.hashMapMethod();
        mapClass.treeMapMethod();
    }

    public void hashMapMethod(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jane", 30);
        hashMap.put("John", 25);
        hashMap.put("Doe", 35);
        hashMap.put("Alice", 40);

        System.out.println(hashMap);
        System.out.println(hashMap.get("John"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        for (Integer value: hashMap.values()){
            System.out.println("Loop: " + value);
        }
    }

    public void treeMapMethod(){
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "John");
        treeMap.put(3, "Doe");
        treeMap.put(2, "Jane");

        System.out.println(treeMap);
        System.out.println(treeMap.get(1));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
    }
}
