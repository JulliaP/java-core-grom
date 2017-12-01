package lesson25;

public class Demo {

    public static void main(String[] args) throws Exception {
        GeneralDAO generalDAO = new GeneralDAO();

        Order order = new Order(1);
        generalDAO.validate(order);
        // Long - eto klass obertki(Wrapper class). Na kazhdyj primitivnyj tip long, int, short est' svoj klass obertki
        // (long - klass obertki Long, int -Integer, short -Short)
        // Zachem eto huzhno?
        long variable = 111; // Eto ne set' ob'jekt, eto- peremennaja
        Long variable1 = 222L; // Vot eto est' i ob'jekt i peremennaja

        int test = 100;
        Long variable2 = new Long(222); // eto tozhe - i ob'jekt i peremennaja
        // KLass obertki sushestvuet dlja togo chto by my s peremennoj primitivnogo tipa mogli rabotat'
        // kak s ob'jektom, a ne kak s obychnoj peremennoj

        TestClass<String, Order, Long> testClass = new TestClass<>();
        System.out.println(testClass.doSomething1("rrr"));

        generalDAO.validate(variable2);

        generalDAO.validate(test);
    }
}