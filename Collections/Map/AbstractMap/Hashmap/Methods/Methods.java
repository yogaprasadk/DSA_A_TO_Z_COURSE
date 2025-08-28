package Methods;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Methods {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // clone
        HashMap<String, String> copy = (HashMap) capitalCities.clone();
        copy.remove("England");

        System.out.println(capitalCities);
        System.out.println(copy);

        // Putifabsent

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 101);
        map.put("two", 201);
        System.out.println("map = " + map);

        map.put("one", 301);
        System.out.println(map);
        process(map);

        // containsKey
        System.out.println("ContainsKey " + map.containsKey("India"));

        // containsValue
        System.out.println("containsValue " + map.containsValue("Delhi"));

        // entrySet - converts hashmap to Set
        System.out.println("entrySet: " + map.entrySet());

        // ForEach
        map.forEach((k, v) -> {
            System.out.println(k + "-> " + v);
        });

        // getOrDefault
        System.out.println(map.getOrDefault("England", -1));

        // isEmpty
        System.out.println(map.isEmpty());

        // keyset
        System.out.println("KeySet: " + map.keySet());

        // merge
        map.merge("cada", 2, (a, b) -> a + b);
        map.merge("ca", 4, (a, b) -> a + b);
        System.out.println("Merge" + map);

        //PutAll
        HashMap<String,String> ans = new HashMap<String,String>();
        ans.put("america","india");
        capitalCities.putAll(ans);
        System.out.println("putAll" + capitalCities);

        //rePlaceAll
        System.out.print("Replace All: ");
        capitalCities.replaceAll((k,v) -> "The capital of" + k + "is "+v);
        System.out.println(capitalCities);
    }

    public static void process(Map<String, Integer> map) {
        map.put("one", 501);
        System.out.println(map);

        Integer one = map.get("three");
        if (one == null) {
            map.put("three", 601);
        }
        System.out.println(map);

        map.putIfAbsent("three", 701);
        System.out.println(map);

        // ComputeIfabsent
        map.computeIfAbsent("four", k -> k.length() * 100);
        System.out.println("Compute if absent " + map);

        map.computeIfAbsent("four", k -> k.length() * 300);
        System.out.println("compute if absent :" + map);

        map.computeIfAbsent("five", k -> k.length() * 100);

        System.out.println(map);

        // computeIfpresent
        map.computeIfPresent("four", (k, v) -> v + 120);
        System.out.println(map);

        map.computeIfPresent("five", (k, v) -> {

            System.out.println("k = " + k);
            System.out.println("V = " + v);
            return v + 100;
        });

        System.out.println(map);

        // compute
        map.compute("six", (k, v) -> k.length() + 1);
        System.out.println("Compute:" + map);

        map.compute("six", (k, v) -> k.length() + 100);
        System.out.println("Compute" + map);

    }

}
