package lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {

        // posmotrim na primere HashSet
        // budem v HashSet dobavljat' elementy
        // esli posmotret' na resultat ispolnenija - elementy razmeshajutsja v strannom porjadke
        // Po povodu porjadka i sortirovki HashSet nichego ne garantiruet,
        // bolle togo s techeniem vremeni porjadok mozhet menjatsja
        // Ego osnovnaja osobennost'(i preimushestvo) - on ne propuskaet dupplicatov
        Set<String> set = new LinkedHashSet<>();
        set.add("testStr");
        set.add("111");
        set.add("aaa");
        set.add("bbb");
        System.out.println(set);
        set.add("aaa");
        set.add("222");
        System.out.println(set);

        Set<File> files = new HashSet<>();
        File file1 = new File("pict.txt", 100);
        File file2 = new File("home.txt", 178);
        File file3 = new File("home.txt", 340);
        // Nizhe rassmatrivaem situaciju - fail3 absolutno identichen file2, no HashSet vse ravno ego dobavil,
        // hot' ran'she mu i skazali chto HashSet ne dopuskaet dubblikatov.
        // V chem tut delo? Kogda HashSet reshaet povtorjajushijsja eto element ili net?
        // Proishodit sravnenie elementov posredstvom metoda Equals. Iznachal'no etot metod ne opredelen,
        // to my ispolzuem po defoltu metod equals iz klassa Object, etot metod sravnivaet mezhdu soboj ssylki na
        // objekt.
        // Poskolku ssylki raznye (file 2 i file3), to HashSet dumaet chto eto raznye ob'ekty
        // Chtoby takoj situacii izbezhat' nuzhno vsego lish' pereopredelit'
        // metod Equals v klasse File ( i avtomatom metod Hashcode)

        // Zdes' zhe rassmatrivaem primer dlja ponimanija o metodax HashCode i Equals.
        // Esli vdrug my opredeljaem metod Equals, no zabyli pro metod HashCode
        // My ran'she govorili o neraryvnosti etix metodov, na Set stanovitsja ponjatno pochemu.
        // Ubiraem iz File metod HashCode, ostavljaem tol'ko Equals. Ispolnjaem- vidim chto dobavilos' opjat vse tri
        // faila. Hotja odin iz nix ne dolzhen by byl,
        // my sdelali equals på file name. Pochemu?? Potomu chro HashSet proverjaet på oboim metodam Equals i HashCode.
        // Esli odin iz nix ne vypolnjaetsja(a ego prosto net),
        // to ob'jkty schitajutsja raznymi, im prisvoilis' raznye HashCody - vse, ob'jekty ne ravny.

        // Vyvod - vsegda pereopredeljaem oba i Equals i HashCode, oni ne razryvny. Eto vazhno.
        files.add(file1);
        files.add(file2);
        files.add(file3);
        System.out.println(files);

    }
}
