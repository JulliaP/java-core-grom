package webinar;

public class InfoClass {

    // Vsegda pered tem kak nacinat' pisat' kod, nuzhno samomu sebe otvetit' na sled voprosy:
    // 1. Gde pisat' metod (v kakom klasse) ?
    // 2. Signatura metoda - kakie parametry etot metod dolzhen prinimat' i kakoj u nego budet tip vozvrashaemogo
    // znachenija.
    // Esli korotko - chto prinimat' i chto vozvrashat'.

    // v real'nom projekte metody "verxnego" urovnja vsegda pishutsja v controllere.
    // "Verxnie metody" - te metody, kotorye vyzyvajutsja pri otkrytii stranicy. To, kak postroen realnyj web-project.

    // Primer. Zahodim na github - posylaetsja zapros s opredelennym adresom i vyzyvaetsja kakoj-to metod, stranica
    // otkryvaetsja.
    // Vot etot pervyj shag obshenija mezhdu zaprosom na server i otkrytiem stranichki proishodit cherez kontroller.
    // Vse zaprosy, kotorye usery vvodjat na stranice oni popadajut na kontroller. Eto obsheprinjataja arhitektura
    // prilozhenij, primenimaja dlja ljubyx jazykov. Esli user nazhimaet knopku Book na web-stranice, zaproc prihodit na
    // Controller.
    // Po etomu principu postroenny vse web-sajty.
    // Vverxu kontroller
    // Potom business-logic
    // Vnizu DAO (Data Access Object)

    // Pochemu DAO vnizy ? Potomu chto eto klass, v kotorom proishodit rabota s dannymi v DB. V DAO pishem metody,
    // kotorye ishut chto-to v etoj
    // DB, dobavljajut novye stroki, ubirajut, proizvodjat update. DAO ispolzujutsja v realnyx proektax
    // ochen i ochen chasto.

    // Sozdanie novogo ob'jekta perezatiraet vse ego polja v predydushem objekte. (esli object ne ob'javlen
    // staticheskim).
    // Esli my ne hotim chtoby object kazhdyj raz perezapisyvalsja, objavljaem ego static.

    // FrontEnd - eto web-stranichka, gde user ostavljset parametry poiska, a takzhe sistema zapominaet ego parametry
    // kak SessionID i Ip-address ego komp'jutera.
    // BackEnd - eto "nevidimaja useru" chast' systemy, gde xranjatsja dannye, idet poisk, validacija i vse takoe.

    // The Single Responsibility Principle is a computer programming principle that states that every class(or method)
    // should have responsibility over a single part of the functionality.
    // Drugimi slovami kazhdyj metod reshaet tol'ko odnu zadachu. Kazhdyj metod kak kirpichik.

    // Metody Update i Save dolzhny kak pravilo vozvrashajut sushnosti kotorye byli updated ili dobavliny(saved).
}
