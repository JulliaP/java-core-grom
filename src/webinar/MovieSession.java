package webinar;

import java.util.Date;

public class MovieSession {
    private long id;
    private int ticketsCount; // kolichestvo mest v zale
    private int ticketsOrdered;
    private Date date;
    private int price;
    private String movieName;
    private String address;

    public MovieSession(long id, int ticketsCount, int ticketsOrdered, Date date, int price, String movieName, String address) {
        this.id = id;
        this.ticketsCount = ticketsCount;
        this.ticketsOrdered = ticketsOrdered;
        this.date = date;
        this.price = price;
        this.movieName = movieName;
        this.address = address;
    }

    public void setTicketsOrdered(int ticketsOrdered) {
        this.ticketsOrdered = ticketsOrdered;
    }

    public int getTicketsOrdered() {
        return ticketsOrdered;
    }

    public long getId() {
        return id;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
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
        MovieSession other = (MovieSession) obj;
        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (!address.equals(other.address)) {
            return false;
        }
        if (date == null) {
            if (other.date != null) {
                return false;
            }
        } else if (!date.equals(other.date)) {
            return false;
        }
        if (movieName == null) {
            if (other.movieName != null) {
                return false;
            }
        } else if (!movieName.equals(other.movieName)) {
            return false;
        }
        return true;
    }

}
