package lesson26.Homework;

public class Demo {

    public static void main(String[] args) {

        ArrayListTest arrayListTest = new ArrayListTest();

        Order order1 = new Order(123, 56, "EUR", "bookhylla", "Möb");
        // long id, int price, String currency, String itemName, String shopIdentificator
        int index1 = 0;
        int index2 = 2;
        arrayListTest.useList(index1, order1, index2);

    }

}
