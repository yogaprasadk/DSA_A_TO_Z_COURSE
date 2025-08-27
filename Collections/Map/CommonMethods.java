

import java.util.*;
public class CommonMethods {
    public static void main(String[] args) {
        Map<String,Integer> cap = new HashMap<>();
        // add an item
        cap.put("Rio",1);
        cap.put("India",2);
        cap.put("Madurai",3);

        System.out.println(cap);

        // get
        System.out.println(cap.get("India"));

        //remove
        System.out.println(cap.remove("Madurai", 3));
        System.out.println(cap);
        
        //ContainsKey
        System.out.println(cap.containsKey("India"));


    }
    
}
