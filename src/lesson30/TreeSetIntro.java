package lesson30;

import java.util.Set;
import java.util.TreeSet;

import lesson29.File;

public class TreeSetIntro {
    // Osnovnoe preimushestvo TreeSet - eto vozmozhnost' sortirovat' v nuzhnom porjadke. V Treeset elementy vsegda
    // sortirujutsja uchityvaja natural'nyj porjadok nashego klassa.
    // Natural'nyj porjadok zadaetsja posredstvom implementacii interfejsa Comparable. Poetomu, chtoby etot klass ne
    // zavalivalsja nam nuzhno v klasse
    // File proimplementit' interface Comparable (do etogo ne bylo). Implementacija interface Comparable podrazumevaet
    // implementaciju(Override) metoda CompareTo. (vse dobavili v klass File)
    // Esli sravnit' s ostal'nymi strukturami dannyx - HashSet voobshe za porjadok ne otvechaet,
    // LinkedHashSet - xranit elementy v tom porjadke, v kotorom oni byli dobavleny

    // nedostatok v tom, chto etot porjadok zadaetsja tol'ko odin raz
    // No dlja mnogix zadach etogo vpolne dostatochno

    // Struktur dannyz nasozdavali tak mnogo dlja togo chtoby inet' vozmozhnost' podbirat' ix ishodja iz uslovij
    // zadachi.

    // Po proizvoditel'nosti TreeSet proigryvaet drugim strukturam dannyx, on medlennee, potomu chto pri kazhdom
    // dobavlenii ili udalenii,
    // nuzhno sortirovat' zanovo i eto zanimaet dopolnitel'noe vremja.
    public static void main(String[] args) {

        Set<File> files = new TreeSet<>();

        File file1 = new File("pict.txt", 100);
        File file2 = new File("home.txt", 178);
        File file3 = new File("home3.txt", 340);

        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);

    }

}
