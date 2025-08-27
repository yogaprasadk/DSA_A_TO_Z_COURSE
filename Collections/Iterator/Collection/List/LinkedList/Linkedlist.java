package Collection.List.LinkedList;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // addFirst()
        list.addFirst(1);
        list.add(3);
        list.add(3);
        list.add(42);
        
        System.out.println("First: "+ list);
        // Addlast()
        list.addLast(323);
        System.out.println("Last:" + list);

        //getFirst()
        System.out.println("Get First" +list.getFirst());

        // getLast()''
        System.out.println("Get Last"+ list.getLast());

        //remove First()
        System.out.println("Remove First"+list.removeFirst());

        // remove Last()
        System.out.println("Remove Last"+list.removeLast());
    }
}
