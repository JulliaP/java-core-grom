package lesson25.Homework;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws Exception {

        GeneralDAO<Invoice> dao1 = new GeneralDAO<>();

        Invoice invoice1 = new Invoice(123, "7776");
        dao1.save(invoice1);
        System.out.println(Arrays.deepToString(dao1.getAll()));

        Invoice invoice2 = new Invoice(-133, "ju23");
        dao1.save(invoice2);
        System.out.println(Arrays.deepToString(dao1.getAll()));

        GeneralDAO<Order> dao2 = new GeneralDAO<>();

        Order order = new Order(587, "Julia");
        dao2.save(order);
        System.out.println(Arrays.deepToString(dao2.getAll()));
    }

}
