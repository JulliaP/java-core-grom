package lesson25.Homework;

public class Invoice extends Document {

    private long id;
    private String orderId;

    public Invoice(long id, String orderId) {
        this.id = id;
        this.orderId = orderId;
    }

    public long getId() {

        return id;
    }

    @Override
    public String toString() {
        return "Invoice [id=" + id + ", orderId=" + orderId + "]";
    }

}
