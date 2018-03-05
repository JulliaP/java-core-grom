package lesson28;

import java.time.ZonedDateTime;
import java.util.Date;

//my hotim chtoby vse kapabilities sortirovalis' på id
//Comparable - sravnivaemyj (tot kotoryj budut sravnivat', sortirovat')

public class Capability implements Comparable<Capability> {
    private long id;
    private String channelName;
    private String fingerprint;
    private boolean isActive;
    private ZonedDateTime dateCreated;

    public Capability(long id, String channelName, String fingerprint, boolean isActive, ZonedDateTime dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isActive() {
        return isActive;
    }

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    // napominalka - poskol'ku Comparable - eto interface, ego metody dolzhny implementitsja/override
    @Override
    public int compareTo(Capability capability) {
        // interesno chto metod CompareTo vozvrashaet intovoe znachenie, a ne boolean
        // -1 OR 0 OR 1 - int mozhet dat' takie znachenija
        // true OR false - boolean takie
        // CompareTo rabotaet sled obrazom, esli -1, to element men'she idet na vtoroe mest, esli 0, vse ostajutsja na
        // svoix mestax
        // 1 - idet na pervoe mesto

        System.out.println("CompareTo is used");
        return (int) (this.id - capability.getId());

        // before: 1001, 1005, 900
        // step1: 1001 - 1005 = -4 //ostaetsja na svoix mestax
        // after: 1001, 1005, 900

        // before: 1001, 1005, 900
        // step2: 1005 - 900 = 105 //1005 i 900 menjajutsja mestami
        // after: 1001, 900, 1005

        // before:1001, 900, 1005
        // step3:1001 - 900 = 101 //900 i 1001 menjajutsja mestami
        // after: 900, 1001, 1005

    }

    @Override
    public String toString() {
        return "Capability [id=" + id + ", channelName=" + channelName + ", fingerprint=" + fingerprint + ", isActive=" + isActive + ", dateCreated=" + dateCreated + "]";
    }

}
