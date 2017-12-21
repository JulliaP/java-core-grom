package lesson28;

import java.time.ZonedDateTime;
import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Date;

public class DemoComparator {

    public static void main(String[] args) {
        ZonedDateTime date1 = ZonedDateTime.now();
        ZonedDateTime date2 = ZonedDateTime.now().minusDays(1);
        ZonedDateTime date3 = ZonedDateTime.now().minusDays(2);
        ZonedDateTime date4 = ZonedDateTime.now().minusDays(3);

        Capability capability1 = new Capability(1200, "Julia", "a", false, date1);
        Capability capability2 = new Capability(1005, "Fadi", "b", false, date2);
        Capability capability3 = new Capability(900, "Fadi", "c", true, date3);
        Capability capability4 = new Capability(1001, "Fadi", "c", true, date4);

        ArrayList<Capability> capabilities = new ArrayList<>();

        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities);

        // capabilities.sort(new IsActiveComparator());
        // capabilities.sort(new DateComparator());
        capabilities.sort(new FullComparator());

        System.out.println(capabilities);

        /*
         * Comparator mozhno sozdavat' ne tol'ko iz odel'nogo klassa. // No i po-drugomu - pereob'javit' vnutri klassa,
         * bex ob'javlenija otdel'nogo klassa. Nizhe primer:
         * 
         * Comparator<Capability> comparator = new Comparator<Capability>() {
         * 
         * @Override public int compare(Capability o1, Capability o2) { // Algoritm // 1.Esli pole ChannelName ne
         * odinakovoe - sravnivaem po nemu // 2. Esli odinakovoe, perexodim k fingerprint // 3. Esli pole fingerprint ne
         * odinakovoe - sravnivaem po nemu // 4. Esli odinakovoe, perexodim k dateCreated // 5. Esli pole dateCreated ne
         * odinakovoe - sravnivaem po nemu // 6. Esli odinakovye - objekty ravny if (!o1.getChannelName().equals(o2)) {
         * return o1.getChannelName().compareTo(o2.getChannelName()); }
         * 
         * // Todo - Vynesti Comparator v otdel'nyj klass
         * 
         * return 0; }
         * 
         * };
         */
    }
}
