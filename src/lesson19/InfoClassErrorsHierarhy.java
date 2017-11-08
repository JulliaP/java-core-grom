package lesson19;

public class InfoClassErrorsHierarhy {
    // Smotri slajd C:\Users\jpodlepina\Documents\Julias\Kartinki iz Java course\Lesson19. Errors hierarchy
    // Samyj vysokij klass dlja oshibok v Java eto Throwable (ne interface). On samyj vysolkij v ierarhii Errors. Vyshe
    // nego tol'ko klass Object.
    // Dalshe oshibki razdeljajutsja na dva lagerja: Exception i Error.
    // Exception - eto kakaja-to nepredvidennaja situacija v kode, kot nuzhno obrabotat' i sdelat' tak chtoby kod ne
    // padal, i pokazal kakoe-to soobshenie ob oshibke.Ih pytaemsja predvidet' i obrabotat'.
    // Error- eto fatal'nja oshibka. Eto ne logicheskaja oshibka. Proizoshlo chto-to kriticheskoe - naprimer
    // -OutOfMemoryError. To, chto obrabatyvat' ne imeet smysla.

    // RuntimeException - eto oshibki, kotorye naimenee znachitel'ny. Te, kot legche vsego predvidet'. Chisto
    // logicheskie. Naprimer ArrayOutOfBoundsException
    // ClassCastException eto kogda ob'jekt odnogo klassa pytaemsja zakastit' k ob'ekty drugogo klassa.
    // ArithmeticException - naprimer delenie na nol'.
    // NullPointerException - eto kogda ot null-ob'ekta pytaemsja chto-to vyzvzat'.
    // IllegalArgumentException - eto kogda kakoj-to argument peredaem, no on ne mozhet byt' obrabotan. Nepravil'nyj
    // argument.

    // Interrupted exception - otnositsja k mnogopotochnosti.

    // Checked vs unchecked exception
    // CHecked exception eto oshibki, kot bolee opasnye i dolzhny byt' 100% obrabotany.
    // Naprimer oshibka raboty s bazoj dannyx

    // Anton skazal, chto v osnovnom vse pol'zujytsja RunTimeException - tak proshe
}
