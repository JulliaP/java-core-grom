package lesson25.Homework;

public class Order extends Document {
    private long id;
    private String description;

    public long getId() {

        return id;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", description=" + description + "]";
    }

}
