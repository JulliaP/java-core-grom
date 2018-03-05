package lesson31;

import java.util.HashMap;

import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {
        // keyValue - eto generiki, poetomu oni mogut byt' ljubyx tipov.
        Map<String, Building> map = new HashMap<>();

        Building building1 = new Building("school", 5);
        Building building2 = new Building("hospital", 8);

        map.put("TTT2222", building1);
        map.put("PG55", building2);

        System.out.println(map);

        // metod KeySet vyvodit vse kljuchi
        System.out.println(map.keySet());

        System.out.println(map.values());
        // metod get po kljuchu vyvodit Value
        System.out.println(map.get("PG55"));

        map.remove("PG55");
        System.out.println(map);
        // komanda nizh - chto by pokazat' otlichie mezhdu hashtable i hashmap. Key so znacheniem Null mozhno odin raz
        // dobavit' v hashmap. No ne poluchitsja dobavit' v hashtable.
        map.put(null, building1);
        System.out.println(map);
        // Po povodu dublikatov. Esli my popytaemsja dobavit' dubblikat - on prosto ne dobavitsja. No programma pri etom
        // ne upadet.
        map.put("TTT2222", building1);
        System.out.println(map);
    }

}
