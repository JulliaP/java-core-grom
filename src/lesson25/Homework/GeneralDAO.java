package lesson25.Homework;

public class GeneralDAO<T extends Document> {

    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Document[10];

    public T save(T t) throws Exception {
        validate(t);
        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];

            }
            index++;

        }

        throw new Exception("No empty slot for Object " + t.getId() + " .Can't be saved ");

    }

    public T[] getAll() {
        return array;
    }

    private void validate(T t) throws Exception {
        if (t.getId() <= 0) {
            throw new Exception("Id can't be negative");
        }
    }

}
