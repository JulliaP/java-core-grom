package lesson27;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TestPerfomance {

    public static void main(String[] args) {
        // nizhe sozdanie ArrayList i LinkedList
        // ArrayList<String> arrayList = new ArrayList<>();
        // LinkedList<String> linkedList = new LinkedList<>();

        testAddMethod();
        testRemoveMethod();
        testGetMethod();

    }

    private static void testGetMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        Date start = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i, "ssss");
        }
        for (int i = 0; i < 100000; i++) {
            arrayList.get(50000);
        }

        Date finish = new Date();

        long diff = finish.getTime() - start.getTime();
        System.out.println("Arraylist _get:" + diff);

        // delaem tozhe samoe dlja LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        Date start1 = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i, "ssss");
        }

        for (int i = 0; i < 100000; i++) {
            linkedList.get(50000);
        }

        Date finish1 = new Date();
        diff = finish1.getTime() - start1.getTime();
        System.out.println("Linkedlist _get:" + diff);
        // Vyvod - dlja udalenija i dobavlenija luchshe ispol'zpvat' LinkedList, u nego luchshe proizvoditel'nost'.
    }

    private static void testAddMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        Date start = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //
        for (int i = 0; i < 1_000_00; i++) {
            arrayList.add(i, "ssss");
        }

        Date finish = new Date();

        long diff = finish.getTime() - start.getTime();
        System.out.println("Arraylist _add:" + diff);

        // delaem tozhe samoe dlja LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        Date start1 = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //
        for (int i = 0; i < 1_000_00; i++) {
            linkedList.add(i, "bbb");
        }

        Date finish1 = new Date();
        diff = finish1.getTime() - start1.getTime();
        System.out.println("Linkedlist _add:" + diff);

    }

    private static void testRemoveMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        Date start = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i, "ssss");
        }
        for (int i = 0; i < 90000; i++) {
            arrayList.remove(1000);
        }

        Date finish = new Date();

        long diff = finish.getTime() - start.getTime();
        System.out.println("Arraylist _remove:" + diff);

        // delaem tozhe samoe dlja LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        Date start1 = new Date();
        // my budem zapolnjat' list bol'shim kolichestvom elementov, naprimer million elementov
        //
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i, "ssss");
        }

        for (int i = 0; i < 90000; i++) {
            linkedList.remove(10000);
        }

        Date finish1 = new Date();
        diff = finish1.getTime() - start1.getTime();
        System.out.println("Linkedlist _remove:" + diff);
        // Vyvod - dlja udalenija i dobavlenija luchshe ispol'zpvat' LinkedList, u nego luchshe proizvoditel'nost'.
    }
}
