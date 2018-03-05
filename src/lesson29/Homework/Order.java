package lesson29.Homework;

import lesson29.File;

public class Order implements Comparable<Order> {

    private long id;
    private int price;
    private String currency;
    private String itemName;
    private String shopIdentificator;

    public Order(long id, int price, String currency, String itemName, String shopIdentificator) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    @Override
    public int compareTo(Order o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
        result = prime * result + price;
        result = prime * result + ((shopIdentificator == null) ? 0 : shopIdentificator.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Order other = (Order) obj;
        if (currency == null) {
            if (other.currency != null) {
                return false;
            }
        } else if (!currency.equals(other.currency)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (itemName == null) {
            if (other.itemName != null) {
                return false;
            }
        } else if (!itemName.equals(other.itemName)) {
            return false;
        }
        if (price != other.price) {
            return false;
        }
        if (shopIdentificator == null) {
            if (other.shopIdentificator != null) {
                return false;
            }
        } else if (!shopIdentificator.equals(other.shopIdentificator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", price=" + price + ", currency=" + currency + ", itemName=" + itemName + ", shopIdentificator=" + shopIdentificator + "]";
    }

}
