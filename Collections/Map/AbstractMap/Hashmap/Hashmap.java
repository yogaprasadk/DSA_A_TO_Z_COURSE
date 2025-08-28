

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // add()
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        //getkey
        System.out.println(capitalCities.get("India"));

        //Remove an item
        System.out.println(capitalCities.remove("India"));
        System.out.println(capitalCities);

        //size
        System.out.println(capitalCities.size());

        //replace
        capitalCities.replace("England", "Losangeles");
        System.out.println(capitalCities);
       
        
        //Loop through an Hashmap
           //1.keyset
        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }
        //2.Value
        for(String i: capitalCities.values()){
            System.out.println(i);
        }  

        //3.values and keys
        for (String i : capitalCities.keySet()) {
            System.out.println("Keys: " + i +"Values"+capitalCities.get(i));
        }

        //Clear
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
