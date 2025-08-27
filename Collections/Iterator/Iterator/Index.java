package Iterator;

import java.util.*;

public class Index {
    public static void main(String[] args) {
        
        List<Integer> Values = new ArrayList<>();
        Values.add(1);
        Values.add(2);
        Values.add(3);
        Values.add(4);
        Values.add(5);

        System.out.println("Iterating Values Using Iterator Methods");
        Iterator<Integer> ValuesIterator = Values.iterator();

        while(ValuesIterator.hasNext()){
            int value = ValuesIterator.next();
            System.out.println(value);
            if(value == 3){
                ValuesIterator.remove();
            }

        }

        
        System.out.println("Iterating The Values Using For Each Loop");
        for (int val : Values) {
            System.out.println(val);
        }

        
        System.out.println("For Each testing:) ");
        Values.forEach((Integer val) -> System.out.println(val));
    }
}