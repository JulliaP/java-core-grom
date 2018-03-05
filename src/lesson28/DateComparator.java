package lesson28;

import java.util.Comparator;

public class DateComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        System.out.println("DemoComparator was used");
        if (o1.getDateCreated() != null && o1.getDateCreated() != null) {
            return o2.getDateCreated().compareTo(o1.getDateCreated());
        } else if (o1.getDateCreated() == null && o2.getDateCreated() != null) {

            return -1;
        }
        return 0;
    }

}
