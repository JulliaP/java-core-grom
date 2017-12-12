package lesson25.Homework;

public class Order extends Document {
    private long id;
    private String description;

    public Order(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {

        return id;
    }

    public String toString() {
        return "Order [id=" + id + ", description=" + description + "]";
    }

}
