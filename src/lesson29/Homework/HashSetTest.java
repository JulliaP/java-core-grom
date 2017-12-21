package lesson29.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public HashSet<Order> useHashSet(Order order) {

        Set<Order> orders = new HashSet<>();

        orders.add(order);
        orders.remove(order);
        orders.retainAll(orders); // Removes from this set all of its elements
        orders.toArray();
        orders.size();

        Iterator<Order> orderIterator = orders.iterator();
        while (orderIterator.hasNext()) {

            // do smth
        }

        return (HashSet<Order>) orders;
    }

}
