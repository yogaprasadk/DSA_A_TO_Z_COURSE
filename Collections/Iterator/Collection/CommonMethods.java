package Collection;
import java.util.*;
public class CommonMethods {
    public static void main(String[] args) {
        List<Integer> Values = new ArrayList<>();
        Values.add(1);
        Values.add(2);
        Values.add(3);
        Values.add(4);
        Values.add(5);

        //Size()
        System.out.println("Size: " + Values.size());

        // isEmpty()
        System.out.println("IsEmpty: "+ Values.isEmpty());

        //Contains()
        System.out.println("Contains: "+ Values.contains(3));

        //add()
        System.out.println("Add: "+Values.add(6));

        System.out.println(Values.contains(6));

        //remove()
        System.out.println("remove "+Values.remove(3));
        System.out.println(Values);
        System.out.println("Values removed Using Index:"+Integer.valueOf(3));

        // Values removed using object first occurence of the value

        System.out.println("remove using object: "+Values.contains(3));
        
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        //AddAll()
        Values.addAll(stackValues);

        // ContainsAll
        System.out.println("Add All test using ContainsAll: "+Values.containsAll(stackValues));

        System.out.println(Values);
        // remove
        Values.remove(Integer.valueOf(8));
        System.out.println("Contains All after removing 1 element: "+Values.containsAll(stackValues));

        //removeAll()
        Values.removeAll(stackValues);
        System.out.println(Values);
        System.out.println("Removeall: "+Values.contains(8));

        // Clear()
        Values.clear();
        System.out.println("Clear: "+Values.isEmpty());
    }    
}
