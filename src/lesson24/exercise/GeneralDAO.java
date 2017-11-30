package lesson24.exercise;

public class GeneralDAO<T> {
    // zdes' nemnogo knepigt. Vo-pervyx sozdat' ob'ekt obychnym obrazom my ne mozhem, vmesto etogo my cozdaem massiv
    // ob'jektov i delaem kast k T[],
    // vo-vtoryx, posle sozdanija cast Ecplipse nachinaet rugat'sja i govorit "Type safety:Unchecked cast from Object[]
    // to T[]"
    // chtoby uspokoit'/obmanut' systemy my dobavljaem annotaciju @SuppressWarnings("unchecked")
    // My kak by zaverjaem IDE - chto my vse proverili, nichego ne upadet

    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[5];
    // v stroke vyshe my sozdali massiv Generikov

    public T save(T t) {
        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            }
            index++;
        }

        return null;
    }

    public T[] getAll() {
        return array;
    }
}
