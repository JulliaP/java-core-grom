package lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//V Set v otlichie ot List  net metoda Get, est' Add, Remove. Vmesto nego est' Iterator
// V Java8 Iterator prakticheski ne ispol'zuetsja. V primere vnizu, 
//loop while s Iteratorom legko zamenit' na for-each loop bez Iteratora.
//Iterator - eto sposob izvlechenija elementov iz Set.
public class IteratorIntro {

    public static void main(String[] args) {
        Set<File> files = new HashSet<>();
        File file1 = new File("pict.txt", 100);
        File file2 = new File("home.txt", 178);
        File file3 = new File("home333.txt", 340);
        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);

        Iterator<File> fileIterator = files.iterator();

        while (fileIterator.hasNext()) {
            System.out.println(fileIterator.next().getFileName());
        }

    }
}
