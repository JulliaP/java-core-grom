package lesson26.Homework;

import java.util.ArrayList;

public class ArrayListTest {

    public ArrayList useList(int index1, Order order, int index2) {

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order);
        orderList.add(index1, order);
        orderList.remove(index1);
        orderList.remove(order);

        ArrayList<Order> orderList1 = new ArrayList<>();
        orderList.addAll(orderList1);

        orderList.subList(index1, index2);
        orderList.set(index1, order);

        orderList.contains(orderList);
        orderList.toArray();

        orderList.clear();

        System.out.println(orderList.toString());
        return orderList;
    }

}
