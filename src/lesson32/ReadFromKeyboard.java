package lesson32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromKeyboard {
    // cel' - chtoby v konsol' shla ta informacija, kotoruju my budem vvodit' s klaviatury.
    // Kak rabotaet scanner - on vhodjashij potok dannyx preobrazovyvaetv String, i potom etot string pri pomoshi
    // standartnyx metodov,
    // obrabatyvat' i vozvrashat' to, chto nam nuzhno - naprimer int, i td.
    // ogranichenie scanner - on ne umeet rabotat' so mnogimi tipami dannyx i eshjo on medlennyj za shet togo chto on
    // preobrazuet String vnutri sebja

    public static void main(String[] args) throws IOException {
        readKeyboardWithIOStream();

    }

    private static void readKeyboardWithScanner() {
        // using scanner
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        System.out.println("Please enter your name");
        System.out.println("Hello " + scanner.nextLine());

        /*
         * // poka u scanera est' sledushie dannye on vyvodi kazhduju strochku togo, chto postupaet na vhod while
         * (scanner.hasNext() && n > 0) { System.out.println(scanner.next() + "!"); n--; if (n == 0) { break; }
         * 
         * }
         */
        scanner.close(); // scaner nuzhno zakryvat' - eto horoshaja praktika. Resurs kushaet pamjat'.
        // S pomoshju scanner my govorim chto resurs bol'she pamjat' potrebljat' ne budet.
    }

    // sejchas my napishem vtoroe reshenie togo zhe samogo
    // kazhetsja chto ono namnogo slozhee i tam mnogo koda,
    // no tam my rabotem naprjamuju so stream i takoe reshene namnogo bystree

    private static void readKeyboardWithIOStream() throws IOException {
        // Sozdaem dva ob'jekta. Pervyj schityvaet, vtoroj obrabotku pozvoljaet rabotat' optomizirov´vanno
        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(reader);
        // Metod kotoryj schityvaet vhodjashuju stroku -br.readLine()
        System.out.println("Please enter your name");
        System.out.println("Hello " + br.readLine() + "!");

    }
}
