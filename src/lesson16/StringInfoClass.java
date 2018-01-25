package lesson16;

public class StringInfoClass {

    // Tema uroka - String.
    // opredelenie string - string eto posledovatel'nost' char.
    // char v odinarnyx kavychkax, String v dvojnyx

    // Varianty kak mozhno sozdat' string
    // 1. String test = "someString";

    // 2.char charVariable = 't';
    // char charVariable1 = 'o';

    // char[] chars = { charVariable, charVariable1 };

    // 3. String test2 = new String("Hello string");

    // Osobennost' sozdanija Stringov v otlichii ot objectov
    // (zdes' pokazano na primere s1-s2 i user1-user2)
    // sostoit v tom chto pod ob'ekty pri napisanii kljuchevogo slova new
    // vydeljaetsja pamjat' v heap,
    // pri sozdanii string pamjat' vydeljaetsja v String pool

    // String pool - eto kusochek pamajti Heap kuda popadajut vse stringi sozdannye ne cherez kljuchevoe slovo new

    // Pri sozdanii String, JVM smotrit est' li v String Pool'e tochno taoj zhe String, esli Da, to novaja oblast'
    // pamjat'
    // ne vydeljaetsja - sdelano dlja optimizacii ispolzovanija pamjati
    // i takim obrazom raznye ssylki budut ukazyvat' na odin i tot zhe ob'ekt (tut bol'shaja raznica mezhdu drugimi
    // ob'ektami i stringami)
    // Esli String sozdan posredstvom kljuchevogo slova new, to pamjat' vydeljaetsja ne v String Pool, a prosto v
    // Heap
    // poetomu vypolnenie vot etoj stroki - System.out.println(new String("abc") == new String("abc")); - dast
    // false, potomu chto po kljuchevomu slovu new sozdastsja dva otdel'nyx objekta "abc" v Heap,
    // cootvetstvenno ssylki ukazyvajut na rznye ob'ekty i ne budut ravny

    // vse eti pravila horosho proilljustrirovany na kartinke C:\Users\jpodlepina\Documents\Julias\Kartinki iz Java
    // course\String pool
    // String s1 = "test";
    // String s2 = "test";

    // System.out.println("5" + (s1 == s2)); // zdes' ssylki ukazyvajut na odin kusochek pamjati v String pool, poetomu
    // oni ravny

    // User user1 = new User();
    // User user2 = new User();

    // Using Intern
    // Intern - metod kotoryj pozvoljaet String(sozdannyj s ispol'zovaniem slova new)
    // dobavit' prinuditel'no v string pool

    // String s3 = new String("pppp"); // posle intern pppp sozdannyj v Heap udaljaetsja garbage collector
    // String s4 = "pppp";

    // System.out.println("6" + (s3 == s4));
    // s3 = s3.intern();

}
