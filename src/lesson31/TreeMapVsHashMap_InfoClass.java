package lesson31;

public class TreeMapVsHashMap_InfoClass {

    // Smotrim na tot zhe slajd po strukturam dannym c 26 ili 27 uroka.
    // Vidim chto struktura dannyx Map vynesena v odel'nys interface. Ona ne otnositsja k Collection kak HashSet,
    // TreeSet i ArrayList.
    // Vse struktury dannyx prednaznacheny dlja xranenija kakix-to dannyx, no Map sil'no otlichaetsja ot kollection,
    // poetomy i vynesena v otdel'nyj interface
    // v Map est' kucha svoix metodov, kotoryx net v collection - containsKey, containsValue, put i t d.
    // Map - eto struktyry dannyx, kotorye xranjat dannye v vide kljuch-znachenija. Chto eto oznachaet?
    // Chto eta struktura dannyx dlja kazhdoj zapisi hranit dva polja - Key and Value, kotoroe nahoditsja pod etim
    // kljuchom.
    // Chtoby sozdat' associaciju s Map, eto mozhno predstavit' kak komnaty, v kotoroj nahodjatsja neskol'ko chelovek i
    // u kazhdogo
    // est' unikal'nyj passport. Nomer passporta - eto i set' kljuch(unikal'noe zhnachenie), Value - eto chelovek. på
    // kljuchu my mozhem dosta' Value.

    // Hashtable. Map vnutri postroena osnovyvajas' na hashtable. (Smotri slajd lesson31)
    // Zdes' umestno eshjo raz napomnit' o vazhnosti metoda hashCode, v hashtable on ispol'zuetsja dlja togo
    // chtoby po Key najti Value, java vychisljaet hashCode i ispolzuja etot Hashcode my vytaskivaem Value.
    // Na slajde nomera 01, 02, 03 i td. Eti nomera eto i est' hashCode.

    // Key ==> hashCode ==> po hashecode nahodim Value

    // To zhe samoe proishodit pri dobavlenii, my vyshchityvaem hashnashego kljucha, po hash nahodim stroku i v etu
    // stroku dobavljaem Value.
    // Vazhno ponimat' chto u kazhdogo kljucha dolzhen byt' pravilno opredelen metod HashCode.
    // Chto by ne bylo situacii chto dlja dvux raznyx kljuchej odinakovyj hashCode.
    // Eshjo raz polezno napomnit' vazhost' metodov Equals i HashCode. Eto eshjo odin primer, gde oni ispol'zujutsja.
    // Raznicy mezhdu hashtable i hashmap pochti net.
    // Est' dva momenta gde oni otlichajutsja. Pervyj kasaetsja mnogopotochnosti. Poka my eto ne rassmatrivali.
    // Vtoroj - ispol'zovanie null. Hashtable ne pozvoljaet xranit' null. Ni v vide Key, ni v vide Value.
    // Hashmap pozvoljaet xranit' odin Key kak null, i neogranichennoe kolichestvo Value kak null.
    // Po performance eti dve struktyry(hashtable i hashmap) odinakovy.

    // Po povodu dublikatov. Esli my popytaemsja dobavit' dubblikat - on prosto ne dobavitsja. No programma pri etom ne
    // upadet.
    // Po povodu LinkedHashMap i TreeMap. Oni analogichny TreeSet i LinkedHashSet. LinkedHashSet ne garantiruet nikakogo
    // porjadka.
    // TreeSet garantiruet porjadok po "natural order".
    // To zhe samoe v maps. TreeMap sortiruet po kljucham. Sootvetstvenno klass kljucha dolzhen implementit' interface
    // Comparable. Inache compiljator budet rugat'sja.

}
