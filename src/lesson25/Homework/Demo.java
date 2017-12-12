package lesson25.Homework;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws Exception {

        GeneralDAO<Invoice> dao1 = new GeneralDAO<>();

        Invoice invoice1 = new Invoice(123, "7776");
        dao1.save(invoice1);
        System.out.println(Arrays.deepToString(dao1.getAll()));

        Invoice invoice2 = new Invoice(133, "ju23");
        dao1.save(invoice2);
        System.out.println(Arrays.deepToString(dao1.getAll()));
    }

}
