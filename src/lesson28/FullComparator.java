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

        if ((o1.getChannelName() != null && o2.getChannelName() != null) && !o1.getChannelName().equals(o2.getChannelName())) {
            return o1.getChannelName().compareTo(o2.getChannelName());

        }

        else if ((o1.getFingerprint() != null && o2.getFingerprint() != null) && !o1.getFingerprint().equals(o2.getFingerprint())) {

            return o1.getFingerprint().compareTo(o2.getFingerprint());

        } else if ((o1.getDateCreated() != null && o2.getDateCreated() != null) && !o1.getDateCreated().equals(o2.getDateCreated())) {

            return o1.getDateCreated().compareTo(o2.getDateCreated());

        }
        return 0;
    }
}
