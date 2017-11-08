package lesson14;

public class InfoClassObjectClone {

    // klass Object - eto verhushka ierarhicheskogo dereva v Java.
    // Pro kazhdyj klass mozhno napisat' chto on nasleduetsja ot klassa Object , like that : public class User extends Object , no tak
    // ne delajut.
    // U klassa Object est' rjad metodov - getClass() ,toString(), clone i t.d , vse klassy v Java nasledujut eti
    // metody avtomaticheski.
    //
    // Metod Clone osobennyj, ego neljzja vyzvat' prosto tak, kak ostal'nye metody tipa getClass. Chtoby ego vyzvat' nuzhno pronasledovat'klass ot interfaca Cloneable. 
    //Kogda my vidim chto klass nasleduetsja ot interfaca Cloneable, my s uverennost'ju mozhem skazat' chto objekty etogo klassa budut klonirovat'sja.
    //Primer kak my klonirovali Object mozhno posmotret' v klasse Test v etom uroke. 
    //Nuzhno chtoby class nasledovalsja ot Cloneable, like that
    // public class Test implements Cloneable
    //
    // The Object class sits at the top of the class hierarchy tree in the Java development environment. Every class in
    // the Java system is a descendent
    // (direct or indirect) of the Object class. The Object class defines the basic state and behavior that all objects
    // must have such as the ability to compare oneself to another object,
    // to convert to a string, to wait on a condition variable, to notify other objects that a condition variable has
    // changed, and to return the object's class.
    //
}
