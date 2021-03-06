package lesson25;

public class GeneralDAO {

    private void print(Order order) {
        System.out.println("order is" + order.toString());
    }

    // generik T dostupen tol'ko v metodew nizhe. V metode vyshe on uzhe ne dostupen
    public <T extends IdEntity> void validate(T t) throws Exception {
        if (t.getId() <= 0) {
            throw new Exception("Id can't be negative");
        }

    }

    public <K> void validate(K k) {
        if (k.equals(100)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}