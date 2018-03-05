package lesson29.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    // public static void main(String[] args) {

    public HashSet<Order> useHashSet() {

        Order order1 = new Order(189, 100, "SEK", "tool", "SU-1456");
        Order order2 = new Order(190, 101, "EUR", "coffetable", "STK-08");
        Order order3 = new Order(191, 102, "USD", "flower", "STK-08");

        Order order4 = new Order(123, 456, "EUR", "ka", "jklj67");
        Order order5 = new Order(124, 865, "HRN", "ika", "jklj67");
        Order order6 = new Order(126, 900, "USD", "jka", "opåol");

        Set<Order> orders1 = new HashSet<>();

        orders1.add(order1);
        orders1.add(order2);
        orders1.add(order3);
        System.out.println(orders1);
        orders1.remove(order3);
        System.out.println(orders1);

        Set<Order> orders2 = new HashSet<>();
        orders2.add(order1);
        orders2.add(order2);
        orders2.add(order4);
        orders2.add(order5);
        orders2.add(order6);
        orders1.retainAll(orders2); // delete the elements orders1 that are not in orders2, hence orders1 is changed,
                                    // orders2 is without changes

        System.out.println(orders1 + " show me orders1");
        System.out.println(orders2 + " show me orders2");
        System.out.println(orders1.size() + " - eto razmer");

        Order[] someArray = new Order[orders2.size()];
        orders2.toArray(someArray);

        for (Order s : someArray) {
            System.out.println((s) + " this what is inside String Array");
        }

        Iterator<Order> orderIterator = orders2.iterator();
        while (orderIterator.hasNext()) {

            System.out.println(orderIterator.next().getId());
        }

        return (HashSet<Order>) orders2;
    }

}
