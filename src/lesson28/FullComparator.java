package lesson28;

import java.util.Comparator;

public class FullComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        // Algoritm
        // 1.Esli pole ChannelName neodinakovoe - sravnivaem po nemu
        // 2. Esli odinakovoe, perexodim k fingerprint
        // 3. Esli pole fingerprint neodinakovoe - sravnivaem po nemu
        // 4. Esli odinakovoe, perexodim k dateCreated
        // 5. Esli pole dateCreated ne odinakovoe - sravnivaem po nemu
        // 6. Esli odinakovye - objekty ravny
        if (!o1.getChannelName().equals(o2)) {
            return o1.getChannelName().compareTo(o2.getChannelName());

        } else if (!o1.getFingerprint().equals(o2)) {

            return o1.getFingerprint().compareTo(o2.getFingerprint());

        } else {

            return o1.getDateCreated().compareTo(o2.getDateCreated());

        }

    }
}