package lesson28;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class DemoComparable {

    public static void main(String[] args) {

        ZonedDateTime date1 = ZonedDateTime.now().minusDays(1);
        ZonedDateTime date2 = ZonedDateTime.now().minusDays(2);
        ZonedDateTime date3 = ZonedDateTime.now().minusDays(3);
        ZonedDateTime date4 = ZonedDateTime.now().minusDays(3);

        Capability capability4 = new Capability(1200, "test", "rrr", false, date1);
        Capability capability2 = new Capability(1005, "test", "rrr", false, date2);
        Capability capability3 = new Capability(900, "test", "rrr", true, date3);
        Capability capability1 = new Capability(1001, "test", "rrr", true, date4);

        Set<Capability> set = new TreeSet<>();
        set.add(capability1);
        set.add(capability2);
        set.add(capability3);
        set.add(capability4);

        System.out.println(set);
    }

}
