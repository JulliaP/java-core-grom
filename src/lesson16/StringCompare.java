package lesson16;

import java.util.Arrays;

public class StringCompare {
    public static void main(String[] args) {

        // Stringi kak slozhnyj typ i ego luchshe sravnivat' cherez equals a ne cherez dvojnoe ravno ==
        System.out.println(new String("abc") == new String("abc"));
        // Sravnennie cherez equals razbivaet String na massiv char'ov i sravnivaet chars mezhdu soboj
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println("abc" == "abc"); // sravnenie ssylok

        // rassmotrim kak equals rabotaet so string i kakoe uslovie ravenstva stringov
        System.out.println("abc".equals("abc"));// sravnenie ob'ektov

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
        String s1 = "test";
        String s2 = "test";

        System.out.println("5" + (s1 == s2)); // zdes' ssylki ukazyvajut na odin kusochek pamjati v String pool, poetomu
                                              // oni ravny

        // User user1 = new User();
        // User user2 = new User();

        // Using Intern
        // Intern - metod kotoryj pozvoljaet String(sozdannyj s ispol'zovaniem slova new)
        // dobavit' prinuditel'no v string pool

        String s3 = new String("pppp"); // posle intern pppp sozdannyj v Heap udaljaetsja garbage collector
        String s4 = "pppp";

        System.out.println("6" + (s3 == s4));
        s3 = s3.intern();

        System.out.println("7" + (s3 == s4));

        // bytes of string
        // Iz ljubogo string mozhno poluchit massiv baitov
        // Eto daet nam vozmozhnost' ix kuda-to pereslat' (prosto string my ne mozhem vyslat')
        // i potom prevratit' potok bytov nazad v Strig.

        String str = "testStringVar";
        System.out.println(Arrays.toString(str.getBytes()));

        System.out.println(new String(str.getBytes()));
        // Otkuda berutsja eti cifry pri ispolnenii komandy? Eto ASCII codes, kazhdomy char sootvetstvuet decimal value

        // test.getBytes();

    }

}
