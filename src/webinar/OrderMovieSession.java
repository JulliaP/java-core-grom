package webinar;

public class OrderMovieSession {

    private long id;
    private MovieSession movieSession;
    private User user;
    // dobavili boolean pole isActive dlja tex sluchaev, kogda user hochet udalit' svoj zakaz.
    // potomu chto v real'nyx proektax zakazy ne udaljajut, a deaktivirujut i soxranjajut v DB so statusom notActive ili
    // Cancelled.

    private boolean isActive;

    public OrderMovieSession(long id, MovieSession movieSession, User user) {
        this.id = id;
        this.movieSession = movieSession;
        this.user = user;
        this.isActive = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MovieSession getMovieSession() {
        return movieSession;
    }

    public User getUser() {
        return user;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
