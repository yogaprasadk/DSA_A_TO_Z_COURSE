import java.util.*;

public class Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // addAll
        list.add(1);
        list.add(33);
        list.add(123);
        list.add(43);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);

        list.addAll(list1);
        System.out.println("AddAll Method: " + list);

        // Clone
        ArrayList<Integer> Clone = (ArrayList) list.clone();
        Clone.set(0, 2);
        System.out.println("Clone: " + Clone);

        // EnsureCapacity
        ArrayList<Integer> EC = new ArrayList<Integer>();
        EC.ensureCapacity(15);
        for (int index = 1; index <= 15; index++) {
            EC.add(index);
        }
        System.out.println("Ensure :" + EC);

        // IndexOf
        ArrayList<String> Cars = new ArrayList<String>();
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Audi");
        Cars.add("Mazda");
        System.out.print("Indexof: ");
        System.out.println(Cars.indexOf("BMW")); // 1
        System.out.println(Cars.indexOf("Rools")); // -1

        // LastIndexOf
        System.out.print("LastIndexOf: ");
        ArrayList<Integer> LI = new ArrayList<>();
        LI.add(3);
        LI.add(36);
        LI.add(312);
        LI.add(31);
        LI.add(33);
        LI.add(53);
        LI.add(3);
        System.out.println(LI.lastIndexOf(3));// 6
        System.out.println(LI.lastIndexOf(1));// -1

        // ListIterator
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ListIterator<String> it = cars.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("----------------------");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        // removeAll
        cars.removeAll(cars);
        System.out.println("RemoveAll: " + cars);

        // removeIf
        LI.removeIf(n -> n % 2 == 1);
        System.out.println("RemoveIf" + LI);

        // ReplaceALl
        System.out.print("Replace All:");
        list1.replaceAll(n -> n + 1);
        System.out.println(list1);

        // RetainAll

        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");
        car.add("Toyota");

        ArrayList<String> valid = new ArrayList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");

        car.retainAll(valid);
        System.out.print("RetainAll" +car);

        // SplitIterator
        ArrayList<String> car1 = new ArrayList<String>();
        car1.add("Volvo");
        car1.add("BMW");
        car1.add("Ford");
        car1.add("Mazda");
        car1.add("Toyota");
        //Get the spliterator and split it
        Spliterator<String> it1 = car1.spliterator();
        Spliterator<String> it2 = it1.trySplit();

        // Loop through FirstIterator
        System.out.println("Spliterator");
        System.out.println("First Spliterator");
        while(it1.tryAdvance((n) -> System.out.println(n)));

        // Loop through Second Iterator
        System.out.println("Second Spliterator");
        while (it2.tryAdvance((n) -> System.out.println(n)));

        //SubList
        System.out.println("SubList: " + car1.subList(1, 3));

        //ToArray()
        Object[] obj = car1.toArray();
        for (Object item : obj) {
            System.out.println("To Array: "+ item);
        }

        //trimToSize
        ArrayList<String> ca = new ArrayList<String>();
    ca.add("Volvo");
    ca.add("BMW");
    ca.add("Ford");
    ca.add("Mazda");
    ca.trimToSize();
    System.out.println("Trim To Size: "+ca);
    }   
}