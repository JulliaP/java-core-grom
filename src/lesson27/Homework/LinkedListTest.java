package lesson27.Homework;

import java.util.LinkedList;

public class LinkedListTest {

    public LinkedList<Order> useList(int index1, Order order, int index2) {

        LinkedList<Order> linkedList = new LinkedList<>();

        linkedList.add(order);
        linkedList.add(index1, order);
        linkedList.remove(index1);
        linkedList.remove(order);
        LinkedList<Order> linkedList1 = new LinkedList<>();
        linkedList.addAll(linkedList1);

        linkedList.subList(index1, index2);

        linkedList.set(index1, order);
        linkedList.contains(order);
        linkedList.clear();

        return linkedList;
    }
}
