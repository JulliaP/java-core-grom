package lesson15;

public class InfoClassCastHashCodeEquals {

    // chto takoe hashCode? Eto chislo, kotoroe formiruetsja på algoritmu vnutri JVM na osnovanii jachejki pamjati, v
    // kotoroj nahoditsja ob'ect.
    // Zachem on nuzhen i gde on ispolzuetsja ? Ispolzuetsja v strukturah dannyx, kot rabotajut s etim hashCode
    // -hashmap, hashtable i t.d. Pochemu hashCode i equals idut vmeste
    // i pochemu nel'zja skazat' chto dostatochno odnogo equals?
    // Potomu chto opredelenie polnogo ravenstva ob'ektov - ob'jecty mezhdu soboj ravny kogda equals vozvrashaet true i
    // hashCody tozhe ravny.
    // V primere na uroke hashcodes nashix objektov ne figa ne ravny. Oni raznye. A metod equals vse ravno vydaet True.
    // Pochemu tak ne sovsem ponjala. Ponjala tol'ko chto hash code budet ispol'zovat'sja v budushem, kogda budem
    // prohodit' struktury ddannyx.
    //
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((extension == null) ? 0 : extension.hashCode());
    // result = prime * result + ((path == null) ? 0 : path.hashCode());
    // result = prime * result + size;
    // return result;
    // }
    //
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj) {
    // return true;
    // }
    // if (obj == null) {
    // return false;
    // }
    // if (getClass() != obj.getClass()) {
    // return false;
    // }

    // operacija kasta i dal'she sravnivaem polja
    // operacija cast - eto operacija privedenija odnogo tipa, bolee shirokogo, k drugomu tipu, bolee uzkomu.
    // v etom primere my objekt tipa Object privodim k bolee uzkomu, konkretnomu tipu File
    // Esli est' object i my 100% znaem chto etot ob'jekt budet opredelennogo tipa, v nashem sluchae tipa File
    // My pered objectom prinuditel'no pishem ego tip( v skobkax) i etot object s'uzitsja do tipa kotoryj my
    // napisali
    // Esli ne delat' cast - Compliljator vydast oshibku

    // instanceOf - eto operator, kotoryj tozhe vozvrashaet true ili false;
    // i on opredeljaet prinadlezhnost' objekta k konkretnomu klassu
    // zachastuju eto ispolzuetsja kogda est' kakaja-to ierarhija/nasledovanie
    // i vy ne uverenny tekushij ob'jekt budet li objektom klassa ili net
    //

}
