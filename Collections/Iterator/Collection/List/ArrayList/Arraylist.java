package Collection.List.ArrayList;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        
        // you can also specify using list interface
        //List<Integer> list = new ArrayList<>();

        //add 
        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Rolls Royce");

        System.out.println("Without Specify Index:"+list);

        //You can also add an element at a specified position by referring to the index number:
        list.add(0,"Mazda");
        System.out.println("Specifying Index:"+ list);

        // Access an Element
        System.out.println("Acess"+list.get(2));

        //change an element
        System.out.println("Change:"+list.set(3,"AUDI"));

        //remove an element
        System.out.println("Remove"+ list.remove(4));

        // Size()
        System.out.println("Size:"+list.size());
        

        //Loop through an arrayList
        for(int i = 0;i<list.size();i++){
            System.out.println("Loop: "+list.get(i));
        }

        // foreachloop
        for(String i:list){
            System.out.println("Enhanced :"+i);
        }

        // Sort
        Collections.sort(list);

        // Reverse Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse"+list);

         // clear/
        list.clear();
        System.out.println("Clear: "+list);
    }
}
