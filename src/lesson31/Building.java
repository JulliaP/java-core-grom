package lesson31;

public class Building {

    private String address;
    private int floors;

    public Building(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building [address=" + address + ", floors=" + floors + "]";
    }

}
