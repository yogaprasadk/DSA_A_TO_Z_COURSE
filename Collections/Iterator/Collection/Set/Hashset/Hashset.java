package Collection.Set.Hashset;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // create an Set 
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(9);// Duplicate
        System.out.println("Add: "+set);

        //Contains()
        System.out.print("Contains: "+  set.contains(4));
       

        //remove()
        System.out.println("Remove: ");
        set.remove(3);
        System.out.println(set);
    

        //Size
        System.out.println("Size: "+set.size());

        // Loop through an Hashset
        for(int i: set){
            System.out.println(i);
        }
    }
}
